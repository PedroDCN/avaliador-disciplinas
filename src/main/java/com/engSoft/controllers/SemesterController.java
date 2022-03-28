package com.engSoft.controllers;

import com.engSoft.DTO.CourseDTO;
import com.engSoft.entities.*;
import com.engSoft.services.CommentService;
import com.engSoft.services.FeedbackService;
import com.engSoft.services.SemesterService;
import com.engSoft.util.ErroCourse;
import com.engSoft.util.ErroSemester;
import com.engSoft.util.ErroTeacher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
@CrossOrigin
public class SemesterController {

    @Autowired
    SemesterService semesterService;

    @Autowired
    CommentService commentService;

    @Autowired
    FeedbackService feedbackService;

    @RequestMapping(value = "/semester/{name}", method = RequestMethod.POST)
    public ResponseEntity<?> createSemester(@PathVariable("name") String name) {
        Optional<Semester> optionalSemester = semesterService.findSemesterByName(name);

        if(optionalSemester.isPresent()) {
            return new ResponseEntity<>("Semester already exist", HttpStatus.CONFLICT);
        }
        Semester newSemester = new Semester(name);
        semesterService.saveSemester(newSemester);
        return new ResponseEntity<>(newSemester, HttpStatus.CREATED);
    }

    @RequestMapping(value = "/semesters", method = RequestMethod.GET)
    public ResponseEntity<?> getAllSemesters(){
        return new ResponseEntity<>(semesterService.getAll(), HttpStatus.ACCEPTED);
    }

    @RequestMapping(value = "/semester/{id}", method = RequestMethod.GET)
    public ResponseEntity<?> getSemesterById(@PathVariable("id") long id) {
        Optional<Semester> optionalSemester = semesterService.findSemesterById(id);

        if(!optionalSemester.isPresent()) {
            return new ResponseEntity<>("Semester not found", HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(optionalSemester.get(), HttpStatus.ACCEPTED);
    }

    @RequestMapping(value = "semesterDelete/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<?> removeSemester(@PathVariable ("id") Long id){
        Optional<Semester> optionalSemester = semesterService.findSemesterById(id);

        if(optionalSemester.isPresent()) {
            semesterService.removeSemester(optionalSemester.get());
            return new ResponseEntity<>(optionalSemester.get(), HttpStatus.OK);
        } else
            return new ResponseEntity<>("Semester not found", HttpStatus.NOT_FOUND);
    }

    @RequestMapping(value = "/admin/courseUpdate/{id}", method = RequestMethod.PUT)
    public ResponseEntity<?> updateCourse(@PathVariable("id") Long id, @RequestParam("newName") String name) {
        Optional<Semester> optionalSemester = semesterService.findSemesterById(id);

        if(!optionalSemester.isPresent())
            return ErroSemester.erroSemesterNotFound();

        Semester semester = optionalSemester.get();
        semester.setName(name);
        atualizaDependentes(semester);
        semesterService.saveSemester(semester);

        return new ResponseEntity<>(semester, HttpStatus.OK);
    }

    public void atualizaDependentes(Semester semester){
        List<Feedback> feedbacks = feedbackService.findFeedbackBySemester(semester.getId());
        for (Feedback f: feedbacks) {
            f.setNomeSemester(semester.getName());
            feedbackService.saveFeedback(f);
        }

    }
}
