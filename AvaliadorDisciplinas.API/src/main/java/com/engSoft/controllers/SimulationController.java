package com.engSoft.controllers;

import com.engSoft.DTO.CourseDTO;
import com.engSoft.DTO.SimpleCourseDTO;
import com.engSoft.entities.Course;
import com.engSoft.entities.Feedback;
import com.engSoft.entities.Teacher;
import com.engSoft.services.CourseService;
import com.engSoft.services.FeedbackService;
import com.engSoft.services.TeacherService;
import com.engSoft.util.ErroCourse;
import com.engSoft.util.ErroSimulation;
import com.engSoft.util.ErroTeacher;
import com.engSoft.util.Util;
import org.hibernate.mapping.Set;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.HashSet;
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

        Integer[] simulation = {0, 0, 0};

        for (Long id : courses_id) {
            Optional<Course> possibleCourse = courseService.findCourseById(id);
            if (!possibleCourse.isPresent()) {
                return ErroSimulation.erroCourseNotFound(id);
            }
            addSimulacao(simulation, possibleCourse.get());
        }
        return new ResponseEntity<>(simulation, HttpStatus.OK);
    }

    private void addSimulacao(Integer[] simulation, Course course) {
        List<Feedback> feedbacks = feedbackService.listFeedbackByCourse(course.getId());
        int workload = getMediaWorkload(feedbacks);
        simulation[0] += 1;
        simulation[1] += (workload * workload);   //Importância ao quadrado para aumentar o peso quanto maior o valor
        simulation[2] += course.getGrade();
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

}
