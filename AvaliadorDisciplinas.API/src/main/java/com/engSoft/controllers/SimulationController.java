package com.engSoft.controllers;

import com.engSoft.entities.Course;
import com.engSoft.entities.Feedback;
import com.engSoft.services.CourseService;
import com.engSoft.services.FeedbackService;
import com.engSoft.util.ErroSimulation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
@CrossOrigin
public class SimulationController {

    @Autowired
    CourseService courseService;

    @Autowired
    FeedbackService feedbackService;

    @RequestMapping(value = "/simulation", method = RequestMethod.POST)
    public ResponseEntity<?> getSimulation(@RequestBody List<Long> courses_id) {

        Simulation simulation = new Simulation();

        for (Long id : courses_id) {
            Optional<Course> possibleCourse = courseService.findCourseById(id);
            if (!possibleCourse.isPresent()) {
                return ErroSimulation.erroCourseNotFound(id);
            }
            addSimulacao(simulation, possibleCourse.get());
        }
        simulation.toPercent();
        return new ResponseEntity<>(simulation, HttpStatus.ACCEPTED);
    }

    private void addSimulacao(Simulation simulation, Course course) {
        List<Feedback> feedbacks = feedbackService.listFeedbackByCourse(course.getId());
        double workload = getMediaWorkload(feedbacks);
        simulation.addCreditos(1);
        simulation.addWorkload(Math.max(Math.log(workload) / Math.log(10), 0)); //Importância ao quadrado para aumentar o peso quanto maior o valor
        simulation.addAvaliacao(course.getGrade());
    }

    private int getMediaWorkload(List<Feedback> feedbacks) {
        int soma = 0;
        int count = 0;

        if (feedbacks.isEmpty()) {
            return 0;
        }

        for (Feedback f: feedbacks) {
            soma += f.getWorkload();
            count += 1;
        }
        return soma/count;
    }

    private static class Simulation {
        public double creditos;
        public double workload;
        public double avaliacao;

        public Simulation() {
            this.creditos = 0;
            this.workload = 0;
            this.avaliacao = 0;
        }

        public void addCreditos(double creditos) {
            this.creditos += creditos;
        }

        public void addWorkload(double workload) {
            this.workload += workload;
        }

        public void addAvaliacao(double avaliacao) {
            this.avaliacao += avaliacao;
        }

        public void toPercent() {
            avaliacao /= 10 * creditos;
            creditos /= 6;
            workload /= 6;
        }
    }
}
