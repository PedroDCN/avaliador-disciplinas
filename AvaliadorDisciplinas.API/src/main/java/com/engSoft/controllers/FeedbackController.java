package com.engSoft.controllers;

import com.engSoft.DTO.FeedbackDTO;
import com.engSoft.entities.Course;
import com.engSoft.entities.Feedback;
import com.engSoft.entities.Semester;
import com.engSoft.entities.User;
import com.engSoft.services.CourseService;
import com.engSoft.services.FeedbackService;
import com.engSoft.services.SemesterService;
import com.engSoft.services.UserService;
import com.engSoft.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
@RestController
@RequestMapping("/api")
@CrossOrigin
public class FeedbackController {

    @Autowired
    FeedbackService feedbackService;

    @Autowired
    CourseService courseService;

    @Autowired
    UserService userService;

    @Autowired
    SemesterService semesterService;

    @RequestMapping(value = "/Feedback", method = RequestMethod.POST)
    public ResponseEntity<?> createFeedback(@RequestBody FeedbackDTO feedbackDTO) {
        Optional<Course> optionalCourse = courseService.findCourseById(feedbackDTO.getIdCourse());

        Optional<User> optionalStudent = userService.getUserById(feedbackDTO.getIdStudent());

        if (!optionalCourse.isPresent()){
            return ErroCourse.erroCourseNotFound();
        }
        if (!optionalStudent.isPresent()){
            return ErroUser.erroUserNotFound();
        }
        Feedback newFeedback = new Feedback(feedbackDTO);
        try {
            feedbackService.saveFeedback(newFeedback);
            courseService.updateGrade(optionalCourse.get(), feedbackService.listFeedbackByCourse(optionalCourse.get().getId()));
            return new ResponseEntity<>(newFeedback, HttpStatus.CREATED);
        }catch (Error e){
            return new ResponseEntity<CustomErrorType>(
                     new CustomErrorType("Error, feedback can´t be created"), HttpStatus.BAD_REQUEST);
        }
    }

    @RequestMapping(value = "/Feedback", method = RequestMethod.GET)
    public ResponseEntity<?> getAllFeedback(){
        List<Feedback> feedbacks = this.feedbackService.listFeedbacks();
        return new ResponseEntity<>(feedbacks, HttpStatus.OK);
    }

    @RequestMapping(value = "/Feedback/listByCourse/{idCourse}", method = RequestMethod.GET)
    public ResponseEntity<?> getAllFeedbacksfromCourse(@PathVariable("idCourse") Long idCourse){
        Optional<Course> optionalCourse = courseService.findCourseById(idCourse);

        if (!optionalCourse.isPresent()){
            return ErroCourse.erroCourseNotFound();
        }
        List<Feedback> feedbacks = feedbackService.listFeedbackByCourse(idCourse);
        return new ResponseEntity<>(feedbacks, HttpStatus.FOUND);

    }
    @RequestMapping(value = "/Feedback/listBySemester/{idSemester}", method = RequestMethod.GET)
    public ResponseEntity<?> getAllFeedbacksfromSemester(@PathVariable("idSemester") Long idSemester){
        Optional<Semester> optionalSemester = semesterService.findSemesterById(idSemester);

        if (!optionalSemester.isPresent()){
            return ErroSemester.erroSemesterNotFound();
        }
        List<Feedback> feedbacks = feedbackService.findFeedbackBySemester(idSemester);
        return new ResponseEntity<>(feedbacks, HttpStatus.FOUND);

    }

    @RequestMapping(value = "/Feedback/{id}", method = RequestMethod.GET)
    public ResponseEntity<?> getFeedback(@PathVariable("id") Long id){
        Optional<Feedback> optionalFeedback = feedbackService.findFeedbackById(id);

        if(!optionalFeedback.isPresent())
            return ErroFeedback.erroFeedbackNotFound();

        return new ResponseEntity<>(optionalFeedback, HttpStatus.FOUND);
    }

    @RequestMapping(value = "/Feedback/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<?> removeFeedback(@PathVariable ("id") Long id){
        Optional<Feedback> optionalFeedback = feedbackService.findFeedbackById(id);

        if(!optionalFeedback.isPresent())
            return ErroFeedback.erroFeedbackNotFound();

        try{
            feedbackService.removeFeedback(id);
            return new ResponseEntity<>(optionalFeedback, HttpStatus.OK);
        }catch (Error e ){
            return new ResponseEntity<CustomErrorType>(
                    new CustomErrorType("Error, feedback can´t be deleted"), HttpStatus.BAD_REQUEST);
        }

    }
}
