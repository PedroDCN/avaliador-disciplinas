package com.engSoft.controllers;


import com.engSoft.DTO.CommentDTO;
import com.engSoft.DTO.ReturnCommentDTO;
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

import java.util.ArrayList;
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

        Optional<Semester> optionalSemester = semesterService.findSemesterById(commentDTO.getIdSemester());

        if (!optionalSemester.isPresent()){
            return ErroSemester.erroSemesterNotFound();
        }

        if (!optionalCourse.isPresent()){
            return ErroCourse.erroCourseNotFound();
        }
        if (!optionalStudent.isPresent()){
            return ErroUser.erroUserNotFound();
        }


        Comment newComment = new Comment(optionalCourse.get(), optionalStudent.get(), optionalSemester.get(), commentDTO.getDescription());
        try {
            commentService.saveComment(newComment);
            return new ResponseEntity<>(new ReturnCommentDTO(newComment), HttpStatus.CREATED);
        }catch (Error e){
            return new ResponseEntity<>(
                    new CustomErrorType("Error, comment can´t be created"), HttpStatus.BAD_REQUEST);
        }
    }
    @RequestMapping(value = "/comment", method = RequestMethod.GET)
    public ResponseEntity<?> getAllComment(){
        List<Comment> comments = this.commentService.listComments();
        return new ResponseEntity<>(toListReturnCommentDTO(comments), HttpStatus.ACCEPTED);
    }
    @RequestMapping(value = "/comment/pageByCourse/{idCourse}", method = RequestMethod.GET)
    public ResponseEntity<?> getPageAllCommentsFromCourse(@PathVariable("idCourse") Long idCourse,@RequestParam("page") Integer page){
        Optional<Course> optionalCourse = courseService.findCourseById(idCourse);

        if (!optionalCourse.isPresent()){
            return ErroCourse.erroCourseNotFound();
        }
        Page<Comment> comments = commentService.pageCommentByCourse(optionalCourse.get(), page);
        return new ResponseEntity<>(toListReturnCommentDTO(comments.getContent()), HttpStatus.ACCEPTED);

    }
    @RequestMapping(value = "/comment/pageByStudent/{idStudent}", method = RequestMethod.GET)
    public ResponseEntity<?> getPageAllCommentsFromStudent(@PathVariable("idStudent") Long idStudent,@RequestParam("page") Integer page){
        Optional<User> optinalUser = userService.getUserById(idStudent);

        if (!optinalUser.isPresent()){
            return ErroUser.erroUserNotFound();
        }
        Page<Comment> comments = commentService.pageCommentByStudent(optinalUser.get(), page);
        return new ResponseEntity<>(toListReturnCommentDTO(comments.getContent()), HttpStatus.ACCEPTED);

    }
    @RequestMapping(value = "/comment/pageBySemesterAndCourse/{idCourse}", method = RequestMethod.GET)
    public ResponseEntity<?> getPageAllCommentsFromSemesterAndCourse(@RequestParam("idSemester") Long idSemester, @PathVariable("idCourse") Long idCourse, @RequestParam("page") Integer page){
        Optional<Semester> optionalSemester = semesterService.findSemesterById(idSemester);

        if (!optionalSemester.isPresent()){
            return ErroSemester.erroSemesterNotFound();
        }

        Optional<Course> optionalCourse = courseService.findCourseById(idCourse);

        if(!optionalCourse.isPresent()) {
            return ErroCourse.erroCourseNotFound();
        }
        Page<Comment> comments = commentService.pageCommentBySemesterAndCourse(optionalSemester.get(), optionalCourse.get(), page);
        return new ResponseEntity<>(toListReturnCommentDTO(comments.getContent()), HttpStatus.ACCEPTED);

    }

    @RequestMapping(value = "/comment/listByCourse/{idCourse}", method = RequestMethod.GET)
    public ResponseEntity<?> getAllCommentsFromCourse(@PathVariable("idCourse") Long idCourse){
        Optional<Course> optionalCourse = courseService.findCourseById(idCourse);

        if (!optionalCourse.isPresent()){
            return ErroCourse.erroCourseNotFound();
        }
        List<Comment> comments = commentService.listCommentByCourse(optionalCourse.get());
        return new ResponseEntity<>(toListReturnCommentDTO(comments), HttpStatus.ACCEPTED);

    }
    @RequestMapping(value = "/comment/listByStudent/{idStudent}", method = RequestMethod.GET)
    public ResponseEntity<?> getAllCommentsFromStudent(@PathVariable("idStudent") Long idStudent){
        Optional<User> optinalUser = userService.getUserById(idStudent);

        if (!optinalUser.isPresent()){
            return ErroUser.erroUserNotFound();
        }
        List<Comment> comments = commentService.listCommentByStudent(optinalUser.get());
        return new ResponseEntity<>(toListReturnCommentDTO(comments), HttpStatus.ACCEPTED);

    }
    @RequestMapping(value = "/comment/listBySemesterAndCourse/{idCourse}", method = RequestMethod.GET)
    public ResponseEntity<?> getAllCommentsFromSemesterAndCourse(@RequestParam("idSemester") Long idSemester, @PathVariable("idCourse") Long idCourse){
        Optional<Semester> optionalSemester = semesterService.findSemesterById(idSemester);

        if (!optionalSemester.isPresent()){
            return ErroSemester.erroSemesterNotFound();
        }

        Optional<Course> optionalCourse = courseService.findCourseById(idCourse);

        if(!optionalCourse.isPresent()) {
            return ErroCourse.erroCourseNotFound();
        }
        List<Comment> comments = commentService.listCommentBySemesterAndCourse(optionalSemester.get(), optionalCourse.get());
        return new ResponseEntity<>(toListReturnCommentDTO(comments), HttpStatus.ACCEPTED);

    }
    @RequestMapping(value = "/comment/{id}", method = RequestMethod.GET)
    public ResponseEntity<?> getComment(@PathVariable("id") Long id){
        Optional<Comment> optionalComment = commentService.findCommentById(id);

        if(!optionalComment.isPresent())
            return ErroComment.erroCommentNotFound();

        return new ResponseEntity<>(new ReturnCommentDTO(optionalComment.get()), HttpStatus.ACCEPTED);
    }

    @RequestMapping(value = "/comment/complaints", method = RequestMethod.GET)
    public ResponseEntity<?> getCommentWithComplaints(){

        return new ResponseEntity<>(toListReturnCommentDTO(commentService.listCommentWithComplaints()), HttpStatus.ACCEPTED);
    }

    @RequestMapping(value = "/admin/comment/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<?> removeComment(@PathVariable ("id") Long id){
        Optional<Comment> optionalComment = commentService.findCommentById(id);

        if(!optionalComment.isPresent())
            return ErroComment.erroCommentNotFound();

        User user = optionalComment.get().getStudent();
        try{
            commentService.removeComment(id);
            commentService.updateDeletedComments(user);
            return new ResponseEntity<>(new ReturnCommentDTO(optionalComment.get()), HttpStatus.OK);
        }catch (Error e ){
            return new ResponseEntity<>(
                    new CustomErrorType("Error, comment can´t be deleted"), HttpStatus.BAD_REQUEST);
        }
    }

    private List<ReturnCommentDTO> toListReturnCommentDTO(List<Comment> list) {
        List<ReturnCommentDTO> returnList = new ArrayList<>();
        for(Comment comment : list) {
            returnList.add(new ReturnCommentDTO(comment));
        } return returnList;
    }
}
