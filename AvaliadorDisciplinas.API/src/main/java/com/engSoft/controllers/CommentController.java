package com.engSoft.controllers;


import com.engSoft.DTO.CommentDTO;
import com.engSoft.entities.*;
import com.engSoft.services.CommentService;
import com.engSoft.services.CourseService;
import com.engSoft.services.SemesterService;
import com.engSoft.services.UserService;
import com.engSoft.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
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
            return new ResponseEntity<>(
                    new CustomErrorType("Error, comment can´t be created"), HttpStatus.BAD_REQUEST);
        }
    }
    @RequestMapping(value = "/Comment", method = RequestMethod.GET)
    public ResponseEntity<?> getAllComment(){
        List<Comment> comments = this.commentService.listComments();
        return new ResponseEntity<>(comments, HttpStatus.ACCEPTED);
    }
    @RequestMapping(value = "/Comment/listByCourse/{idCourse}", method = RequestMethod.GET)
    public ResponseEntity<?> getAllCommentsfromCourse(@PathVariable("idCourse") Long idCourse){
        Optional<Course> optionalCourse = courseService.findCourseById(idCourse);

        if (!optionalCourse.isPresent()){
            return ErroCourse.erroCourseNotFound();
        }
        List<Comment> comments = commentService.listCommentByCourse(idCourse);
        return new ResponseEntity<>(comments, HttpStatus.ACCEPTED);

    }
    @RequestMapping(value = "/Comment/listBySemesterAndCourse/{idSemester}/{idCourse}/{page}", method = RequestMethod.GET)
    public ResponseEntity<?> getAllCommentsfromSemesterAndCourse(@PathVariable("idSemester") Long idSemester, @PathVariable("idCourse") Long idCourse, @PathVariable("page") Integer page){
        Optional<Semester> optionalSemester = semesterService.findSemesterById(idSemester);

        if (!optionalSemester.isPresent()){
            return ErroSemester.erroSemesterNotFound();
        }
        Page<Comment> comments = commentService.listCommentBySemesterAndCourse(idSemester, idCourse, page);
        return new ResponseEntity<>(comments, HttpStatus.ACCEPTED);

    }
    @RequestMapping(value = "/Comment/{id}", method = RequestMethod.GET)
    public ResponseEntity<?> getComment(@PathVariable("id") Long id){
        Optional<Comment> optionalComment = commentService.findCommentById(id);

        if(!optionalComment.isPresent())
            return ErroComment.erroCommentNotFound();

        return new ResponseEntity<>(optionalComment, HttpStatus.ACCEPTED);
    }

    @RequestMapping(value = "/admin/Comment/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<?> removeComment(@PathVariable ("id") Long id){
        Optional<Comment> optionalComment = commentService.findCommentById(id);

        if(!optionalComment.isPresent())
            return ErroComment.erroCommentNotFound();

        Optional<User> user = userService.getUserById(optionalComment.get().getIdStudent());
        if (!user.isPresent())
            return ErroUser.erroUserNotFound();
        Long idAuthor = optionalComment.get().getIdStudent();
        if (!user.get().getIsAdmin() || !user.get().getId().equals(idAuthor)){
            return ErroComment.erroCommentNotAccessible();

        }

        try{
            commentService.removeComment(id);
            commentService.updateDeletedComments(user.get());
            return new ResponseEntity<>(optionalComment, HttpStatus.OK);
        }catch (Error e ){
            return new ResponseEntity<>(
                    new CustomErrorType("Error, comment can´t be deleted"), HttpStatus.BAD_REQUEST);
        }

    }
}
