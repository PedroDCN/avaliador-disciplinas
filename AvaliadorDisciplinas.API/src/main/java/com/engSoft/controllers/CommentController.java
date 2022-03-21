package com.engSoft.controllers;


import com.engSoft.DTO.CommentDTO;
import com.engSoft.entities.*;
import com.engSoft.services.CommentService;
import com.engSoft.services.CourseService;
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
public class CommentController {
    @Autowired
    CommentService commentService;

    @Autowired
    CourseService courseService;

    @Autowired
    UserService userService;

    @Autowired
    SemesterService semesterService;


    @RequestMapping(value = "/Comment", method = RequestMethod.POST)
    public ResponseEntity<?> createComment(@RequestBody CommentDTO commentDTO) {
        Optional<Course> optionalCourse = courseService.findCourseById(commentDTO.getIdCourse());

        Optional<User> optionalStudent = userService.getUserById(commentDTO.getIdStudent());

        if (!optionalCourse.isPresent()){
            return ErroCourse.erroCourseNotFound();
        }
        if (!optionalStudent.isPresent()){
            return ErroUser.erroUserNotFound();
        }
        Comment newComment = new Comment(commentDTO);
        try {
            commentService.saveComment(newComment);
            return new ResponseEntity<>(newComment, HttpStatus.CREATED);
        }catch (Error e){
            return new ResponseEntity<CustomErrorType>(
                    new CustomErrorType("Error, comment can´t be created"), HttpStatus.BAD_REQUEST);
        }
    }
    @RequestMapping(value = "/Comment", method = RequestMethod.GET)
    public ResponseEntity<?> getAllComment(){
        List<Comment> comments = this.commentService.listComments();
        return new ResponseEntity<>(comments, HttpStatus.OK);
    }
    @RequestMapping(value = "/Comment/listByCourse/{idCourse}", method = RequestMethod.GET)
    public ResponseEntity<?> getAllCommentsfromCourse(@PathVariable("idCourse") Long idCourse){
        Optional<Course> optionalCourse = courseService.findCourseById(idCourse);

        if (!optionalCourse.isPresent()){
            return ErroCourse.erroCourseNotFound();
        }
        List<Comment> comments = commentService.listCommentByCourse(idCourse);
        return new ResponseEntity<>(comments, HttpStatus.FOUND);

    }
    @RequestMapping(value = "/Comment/listBySemester/{idSemester}", method = RequestMethod.GET)
    public ResponseEntity<?> getAllCommentsfromSemester(@PathVariable("idSemester") Long idSemester){
        Optional<Semester> optionalSemester = semesterService.findSemesterById(idSemester);

        if (!optionalSemester.isPresent()){
            return ErroSemester.erroSemesterNotFound();
        }
        List<Comment> comments = commentService.listCommentBySemester(idSemester);
        return new ResponseEntity<>(comments, HttpStatus.FOUND);

    }
    @RequestMapping(value = "/Comment/{id}", method = RequestMethod.GET)
    public ResponseEntity<?> getComment(@PathVariable("id") Long id){
        Optional<Comment> optionalComment = commentService.findCommentById(id);

        if(!optionalComment.isPresent())
            return ErroComment.erroCommentNotFound();

        return new ResponseEntity<>(optionalComment, HttpStatus.FOUND);
    }

    @RequestMapping(value = "/admin/Comment/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<?> removeComment(@PathVariable ("id") Long id){
        Optional<Comment> optionalComment = commentService.findCommentById(id);

        if(!optionalComment.isPresent())
            return ErroComment.erroCommentNotFound();

        try{
            commentService.removeComment(id);
            return new ResponseEntity<>(optionalComment, HttpStatus.OK);
        }catch (Error e ){
            return new ResponseEntity<CustomErrorType>(
                    new CustomErrorType("Error, comment can´t be deleted"), HttpStatus.BAD_REQUEST);
        }

    }
}
