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


    @RequestMapping(value = "/comment", method = RequestMethod.POST)
    public ResponseEntity<?> createComment(@RequestBody CommentDTO commentDTO) {
        Optional<Course> optionalCourse = courseService.findCourseById(commentDTO.getIdCourse());

        Optional<User> optionalStudent = userService.getUserById(commentDTO.getIdStudent());

        if (!optionalCourse.isPresent()){
            return ErroCourse.erroCourseNotFound();
        }
        if (!optionalStudent.isPresent()){
            return ErroUser.erroUserNotFound();
        }
        Comment newComment = new Comment(commentDTO, optionalStudent.get().getNick(), optionalStudent.get().getPhoto_url());
        try {
            commentService.saveComment(newComment);
            return new ResponseEntity<>(newComment, HttpStatus.CREATED);
        }catch (Error e){
            return new ResponseEntity<>(
                    new CustomErrorType("Error, comment can´t be created"), HttpStatus.BAD_REQUEST);
        }
    }
    @RequestMapping(value = "/comment", method = RequestMethod.GET)
    public ResponseEntity<?> getAllComment(){
        List<Comment> comments = this.commentService.listComments();
        return new ResponseEntity<>(comments, HttpStatus.ACCEPTED);
    }
    @RequestMapping(value = "/comment/pageByCourse/{idCourse}", method = RequestMethod.GET)
    public ResponseEntity<?> getPageAllCommentsFromCourse(@PathVariable("idCourse") Long idCourse,@RequestParam("page") Integer page){
        Optional<Course> optionalCourse = courseService.findCourseById(idCourse);

        if (!optionalCourse.isPresent()){
            return ErroCourse.erroCourseNotFound();
        }
        Page<Comment> comments = commentService.pageCommentByCourse(idCourse, page);
        return new ResponseEntity<>(comments.getContent(), HttpStatus.ACCEPTED);

    }
    @RequestMapping(value = "/comment/pageByStudent/{idStudent}", method = RequestMethod.GET)
    public ResponseEntity<?> getPageAllCommentsFromStudent(@PathVariable("idStudent") Long idStudent,@RequestParam("page") Integer page){
        Optional<User> optinalUser = userService.getUserById(idStudent);

        if (!optinalUser.isPresent()){
            return ErroUser.erroUserNotFound();
        }
        Page<Comment> comments = commentService.pageCommentByStudent(idStudent, page);
        return new ResponseEntity<>(comments.getContent(), HttpStatus.ACCEPTED);

    }
    @RequestMapping(value = "/comment/pageBySemesterAndCourse/{idCourse}", method = RequestMethod.GET)
    public ResponseEntity<?> getPageAllCommentsFromSemesterAndCourse(@RequestParam("idSemester") Long idSemester, @PathVariable("idCourse") Long idCourse, @RequestParam("page") Integer page){
        Optional<Semester> optionalSemester = semesterService.findSemesterById(idSemester);

        if (!optionalSemester.isPresent()){
            return ErroSemester.erroSemesterNotFound();
        }
        Page<Comment> comments = commentService.pageCommentBySemesterAndCourse(idSemester, idCourse, page);
        return new ResponseEntity<>(comments.getContent(), HttpStatus.ACCEPTED);

    }

    @RequestMapping(value = "/comment/listByCourse/{idCourse}", method = RequestMethod.GET)
    public ResponseEntity<?> getAllCommentsFromCourse(@PathVariable("idCourse") Long idCourse){
        Optional<Course> optionalCourse = courseService.findCourseById(idCourse);

        if (!optionalCourse.isPresent()){
            return ErroCourse.erroCourseNotFound();
        }
        List<Comment> comments = commentService.listCommentByCourse(idCourse);
        return new ResponseEntity<>(comments, HttpStatus.ACCEPTED);

    }
    @RequestMapping(value = "/comment/listByStudent/{idStudent}", method = RequestMethod.GET)
    public ResponseEntity<?> getAllCommentsFromStudent(@PathVariable("idStudent") Long idStudent){
        Optional<User> optinalUser = userService.getUserById(idStudent);

        if (!optinalUser.isPresent()){
            return ErroUser.erroUserNotFound();
        }
        List<Comment> comments = commentService.listCommentByStudent(idStudent);
        return new ResponseEntity<>(comments, HttpStatus.ACCEPTED);

    }
    @RequestMapping(value = "/comment/listBySemesterAndCourse/{idCourse}", method = RequestMethod.GET)
    public ResponseEntity<?> getAllCommentsFromSemesterAndCourse(@RequestParam("idSemester") Long idSemester, @PathVariable("idCourse") Long idCourse){
        Optional<Semester> optionalSemester = semesterService.findSemesterById(idSemester);

        if (!optionalSemester.isPresent()){
            return ErroSemester.erroSemesterNotFound();
        }
        List<Comment> comments = commentService.listCommentBySemesterAndCourse(idSemester, idCourse);
        return new ResponseEntity<>(comments, HttpStatus.ACCEPTED);

    }
    @RequestMapping(value = "/comment/{id}", method = RequestMethod.GET)
    public ResponseEntity<?> getComment(@PathVariable("id") Long id){
        Optional<Comment> optionalComment = commentService.findCommentById(id);

        if(!optionalComment.isPresent())
            return ErroComment.erroCommentNotFound();

        return new ResponseEntity<>(optionalComment, HttpStatus.ACCEPTED);
    }

    @RequestMapping(value = "/comment/complaints", method = RequestMethod.GET)
    public ResponseEntity<?> getCommentWithComplaints(){

        return new ResponseEntity<>(commentService.listCommentWithComplaints(), HttpStatus.ACCEPTED);
    }

    @RequestMapping(value = "/admin/comment/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<?> removeComment(@PathVariable ("id") Long id){
        Optional<Comment> optionalComment = commentService.findCommentById(id);

        if(!optionalComment.isPresent())
            return ErroComment.erroCommentNotFound();

        Optional<User> user = userService.getUserById(optionalComment.get().getIdStudent());
        if (!user.isPresent())
            return ErroUser.erroUserNotFound();

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
