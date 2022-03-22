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
        return new ResponseEntity<>(simulation, HttpStatus.OK);
    }

    private void addSimulacao(Simulation simulation, Course course) {
        List<Feedback> feedbacks = feedbackService.listFeedbackByCourse(course.getId());
        int workload = getMediaWorkload(feedbacks);
        simulation.addCreditos(1);
        simulation.addWorkload((workload*workload)); //Importância ao quadrado para aumentar o peso quanto maior o valor
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
        public int creditos;
        public int workload;
        public int avaliacao;

        public Simulation() {
            this.creditos = 0;
            this.workload = 0;
            this.avaliacao = 0;
        }

        public void addCreditos(int creditos) {
            this.creditos += creditos;
        }

        public void addWorkload(int workload) {
            this.workload += workload;
        }

        public void addAvaliacao(int avaliacao) {
            this.avaliacao += avaliacao;
        }
    }
}
