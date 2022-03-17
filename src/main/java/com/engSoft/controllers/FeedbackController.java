package com.engSoft.controllers;

import com.engSoft.DTO.FeedbackDTO;
import com.engSoft.entities.Course;
import com.engSoft.entities.Feedback;
import com.engSoft.entities.Student;
import com.engSoft.services.CourseService;
import com.engSoft.services.FeedbackService;
import com.engSoft.services.StudentService;
import com.engSoft.util.CustomErrorType;
import com.engSoft.util.ErroCourse;
import com.engSoft.util.ErroFeedback;
import com.engSoft.util.ErroStudent;
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
    StudentService studentService;

    @RequestMapping(value = "/Feedback", method = RequestMethod.POST)
    public ResponseEntity<?> createFeedback(@RequestBody FeedbackDTO feedbackDTO) {
        Optional<Course> optionalCourse = courseService.findCourseById(feedbackDTO.getIdCourse());

        Optional<Student> optionalStudent = studentService.getStudentById(feedbackDTO.getIdStudent());

        if (!optionalCourse.isPresent()){
            return ErroCourse.erroCourseNotFound();
        }
        if (!optionalStudent.isPresent()){
            return ErroStudent.erroStudentNotFound();
        }
        Feedback newFeedback = new Feedback(feedbackDTO);
        try {
            feedbackService.saveFeedback(newFeedback);
            return new ResponseEntity<String>("Feedback succesfully created! \n" + newFeedback, HttpStatus.CREATED);
        }catch (Error e){
            return new ResponseEntity<CustomErrorType>(
                     new CustomErrorType("Error, feedback can´t be created"), HttpStatus.NOT_FOUND);
        }
    }

    @RequestMapping(value = "/Feedback", method = RequestMethod.GET)
    public ResponseEntity<?> getAllFeedback(){
        List<Feedback> feedbacks = this.feedbackService.listFeedbacks();
        return new ResponseEntity<String>("Feedbacks found! \n" + feedbacks, HttpStatus.OK);
    }

    @RequestMapping(value = "/Feedback/listByCourse/{idCourse}", method = RequestMethod.GET)
    public ResponseEntity<?> getAllFeedbacksfromCourse(@PathVariable("idCourse") Long idCourse){
        Optional<Course> optionalCourse = courseService.findCourseById(idCourse);

        if (!optionalCourse.isPresent()){
            return ErroCourse.erroCourseNotFound();
        }
        List<Feedback> feedbacks = feedbackService.listFeedbackByCourse(idCourse);
        return new ResponseEntity<String>("Feedback Found! \n" + feedbacks, HttpStatus.FOUND);

    }

    @RequestMapping(value = "/Feedback/{id}", method = RequestMethod.GET)
    public ResponseEntity<?> getFeedback(@PathVariable("id") Long id){
        Optional<Feedback> optionalFeedback = feedbackService.findFeedbackById(id);

        if(!optionalFeedback.isPresent())
            return ErroFeedback.erroFeedbackNotFound();

        return new ResponseEntity<String>("Feedback found! \n" + optionalFeedback, HttpStatus.FOUND);
    }

    @RequestMapping(value = "Feedback/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<?> removeFeedback(@PathVariable ("id") Long id){
        Optional<Feedback> optionalFeedback = feedbackService.findFeedbackById(id);

        if(!optionalFeedback.isPresent())
            return ErroFeedback.erroFeedbackNotFound();

        try{
            feedbackService.removeFeedback(id);
            return new ResponseEntity<String>("Feedback succesfully deleted \n" + optionalFeedback, HttpStatus.OK);
        }catch (Error e ){
            return new ResponseEntity<CustomErrorType>(
                    new CustomErrorType("Error, feedback can´t be deleted"), HttpStatus.NOT_FOUND);
        }

    }
}
