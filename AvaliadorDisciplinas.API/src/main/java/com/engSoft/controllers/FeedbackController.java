package com.engSoft.controllers;

import com.engSoft.DTO.FeedbackDTO;
import com.engSoft.DTO.ReturnFeedbackDTO;
import com.engSoft.entities.*;
import com.engSoft.services.CourseService;
import com.engSoft.services.FeedbackService;
import com.engSoft.services.SemesterService;
import com.engSoft.services.UserService;
import com.engSoft.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
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

    @Autowired
    UserController userController;

    @RequestMapping(value = "/feedback", method = RequestMethod.POST)
    public ResponseEntity<?> createFeedback(@RequestBody FeedbackDTO feedbackDTO) {
        Optional<Course> optionalCourse = courseService.findCourseById(feedbackDTO.getIdCourse());

        Optional<User> optionalStudent = userService.getUserById(feedbackDTO.getIdStudent());

        Optional<Semester> optionalSemester = semesterService.findSemesterById(feedbackDTO.getIdSemester());

        if (!optionalCourse.isPresent()){
            return ErroCourse.erroCourseNotFound();
        }
        if (!optionalStudent.isPresent()){
            return ErroUser.erroUserNotFound();
        }
        if (!optionalSemester.isPresent()){
            return ErroSemester.erroSemesterNotFound();
        }

        if (!feedbackService.findFeedbackByStudentCourseAndSemester(optionalStudent.get(), optionalCourse.get(), optionalSemester.get()).isEmpty()){
            return ErroFeedback.erroFeedbackAlreadyExists();
        }

        Feedback newFeedback = new Feedback(feedbackDTO, optionalCourse.get(), optionalStudent.get(), optionalSemester.get());
        try {
            feedbackService.saveFeedback(newFeedback);
            courseService.updateGrade(newFeedback.getCourse(), feedbackService.listFeedbackByCourse(newFeedback.getCourse()));
            return new ResponseEntity<>(new ReturnFeedbackDTO(newFeedback), HttpStatus.CREATED);
        }catch (Error e){
            return new ResponseEntity<>(
                     new CustomErrorType("Error, feedback can´t be created"), HttpStatus.BAD_REQUEST);
        }
    }

    @RequestMapping(value = "/feedback", method = RequestMethod.GET)
    public ResponseEntity<?> getAllFeedback(){
        List<Feedback> feedbacks = this.feedbackService.listFeedbacks();
        return new ResponseEntity<>(toListReturnFeedbackDTO(feedbacks), HttpStatus.ACCEPTED);
    }

    @RequestMapping(value = "/feedback/listByUser/{idUser}", method = RequestMethod.GET)
    public ResponseEntity<?> getAllFeedbacksFromUser(@PathVariable("idUser") Long idUser){
        Optional<User> optionalUser = userService.getUserById(idUser);


        if (!optionalUser.isPresent()){
            return ErroUser.erroUserNotFound();
        }
        List<Feedback> feedbacks = feedbackService.findFeedbackByStudent(optionalUser.get());
        return new ResponseEntity<>(toListReturnFeedbackDTO(feedbacks), HttpStatus.ACCEPTED);

    }

    @RequestMapping(value = "/feedback/listByCourse/{idCourse}", method = RequestMethod.GET)
    public ResponseEntity<?> getAllFeedbacksFromCourse(@PathVariable("idCourse") Long idCourse){
        Optional<Course> optionalCourse = courseService.findCourseById(idCourse);

        if (!optionalCourse.isPresent()){
            return ErroCourse.erroCourseNotFound();
        }
        List<Feedback> feedbacks = feedbackService.listFeedbackByCourse(optionalCourse.get());
        return new ResponseEntity<>(toListReturnFeedbackDTO(feedbacks), HttpStatus.ACCEPTED);

    }

    @RequestMapping(value = "/feedback/averageByCourse/{idCourse}", method = RequestMethod.GET)
    public ResponseEntity<?> getAverageFeedbacksFromCourse(@PathVariable("idCourse") Long idCourse){
        Optional<Course> optionalCourse = courseService.findCourseById(idCourse);

        if (!optionalCourse.isPresent()){
            return ErroCourse.erroCourseNotFound();
        }

        AverageFeedback averageFeedback = feedbackService.averageFeedbackByCourse(optionalCourse.get());
        return new ResponseEntity<>(averageFeedback, HttpStatus.ACCEPTED);

    }

    @RequestMapping(value = "/feedback/listBySemester/{idSemester}", method = RequestMethod.GET)
    public ResponseEntity<?> getAllFeedbacksFromSemester(@PathVariable("idSemester") Long idSemester){
        Optional<Semester> optionalSemester = semesterService.findSemesterById(idSemester);

        if (!optionalSemester.isPresent()){
            return ErroSemester.erroSemesterNotFound();
        }
        List<Feedback> feedbacks = feedbackService.findFeedbackBySemester(optionalSemester.get());
        return new ResponseEntity<>(toListReturnFeedbackDTO(feedbacks), HttpStatus.ACCEPTED);

    }

    @RequestMapping(value = "/feedback/listByCourseSemester/", method = RequestMethod.GET)
    public ResponseEntity<?> getAllFeedbacksFromCourseAndSemester(@RequestParam("idSemester") Long idSemester, @RequestParam Long idCourse){
        Optional<Semester> optionalSemester = semesterService.findSemesterById(idSemester);
        Optional<Course> optionalCourse = courseService.findCourseById(idCourse);

        if (!optionalSemester.isPresent()){
            return ErroSemester.erroSemesterNotFound();
        }
        if (!optionalCourse.isPresent()){
            return ErroCourse.erroCourseNotFound();
        }
        List<Feedback> feedbacks = feedbackService.findFeedbackByCourseAndSemester(optionalCourse.get(), optionalSemester.get());
        return new ResponseEntity<>(toListReturnFeedbackDTO(feedbacks), HttpStatus.ACCEPTED);

    }

    @RequestMapping(value = "/feedback/averageByCourseSemester", method = RequestMethod.GET)
    public ResponseEntity<?> getAverageFeedbacksFromCourseAndSemester(@RequestParam("idSemester") Long idSemester, @RequestParam("idCourse") Long idCourse){
        Optional<Semester> optionalSemester = semesterService.findSemesterById(idSemester);
        Optional<Course> optionalCourse = courseService.findCourseById(idCourse);

        if (!optionalSemester.isPresent()){
            return ErroSemester.erroSemesterNotFound();
        }
        if (!optionalCourse.isPresent()){
            return ErroCourse.erroCourseNotFound();
        }

        AverageFeedback averageFeedback = feedbackService.averageFeedbackByCourseAndSemester(optionalCourse.get(), optionalSemester.get());
        return new ResponseEntity<>(averageFeedback, HttpStatus.ACCEPTED);

    }

    @RequestMapping(value = "/feedback/{id}", method = RequestMethod.GET)
    public ResponseEntity<?> getFeedback(@PathVariable("id") Long id){
        Optional<Feedback> optionalFeedback = feedbackService.findFeedbackById(id);

        if(!optionalFeedback.isPresent())
            return ErroFeedback.erroFeedbackNotFound();

        return new ResponseEntity<>(new ReturnFeedbackDTO(optionalFeedback.get()), HttpStatus.ACCEPTED);
    }

    @RequestMapping(value = "/feedback/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<?> removeFeedback(@PathVariable ("id") Long id){
        Optional<Feedback> optionalFeedback = feedbackService.findFeedbackById(id);

        if(!optionalFeedback.isPresent())
            return ErroFeedback.erroFeedbackNotFound();

        try{
            feedbackService.removeFeedback(id);
            Course course = optionalFeedback.get().getCourse();
            courseService.updateGrade(course, feedbackService.listFeedbackByCourse(course));
            return new ResponseEntity<>(new ReturnFeedbackDTO(optionalFeedback.get()), HttpStatus.OK);
        }catch (Error e ){
            return new ResponseEntity<>(
                    new CustomErrorType("Error, feedback can´t be deleted"), HttpStatus.BAD_REQUEST);
        }
    }

    private List<ReturnFeedbackDTO> toListReturnFeedbackDTO(List<Feedback> list) {
        List<ReturnFeedbackDTO> returnList = new ArrayList<>();
        for(Feedback feedback : list) {
            returnList.add(new ReturnFeedbackDTO(feedback));
        }
        return returnList;
    }
}
