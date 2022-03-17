package com.engSoft.controllers;


import com.engSoft.DTO.CommentDTO;
import com.engSoft.DTO.FeedbackDTO;
import com.engSoft.entities.Comment;
import com.engSoft.entities.Course;
import com.engSoft.entities.Feedback;
import com.engSoft.entities.Student;
import com.engSoft.services.CommentService;
import com.engSoft.services.CourseService;
import com.engSoft.services.StudentService;
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
    StudentService studentService;

    @RequestMapping(value = "/Comment", method = RequestMethod.POST)
    public ResponseEntity<?> createComment(@RequestBody CommentDTO commentDTO) {
        Optional<Course> optionalCourse = courseService.findCourseById(commentDTO.getIdCourse());

        Optional<Student> optionalStudent = studentService.getStudentById(commentDTO.getIdStudent());

        if (!optionalCourse.isPresent()){
            return ErroCourse.erroCourseNotFound();
        }
        if (!optionalStudent.isPresent()){
            return ErroStudent.erroStudentNotFound();
        }
        Comment newComment = new Comment(commentDTO);
        try {
            commentService.saveComment(newComment);
            return new ResponseEntity<String>("Comment succesfully created! \n" + newComment, HttpStatus.CREATED);
        }catch (Error e){
            return new ResponseEntity<CustomErrorType>(
                    new CustomErrorType("Error, comment can´t be created"), HttpStatus.BAD_REQUEST);
        }
    }
    @RequestMapping(value = "/Comment", method = RequestMethod.GET)
    public ResponseEntity<?> getAllComment(){
        List<Comment> comments = this.commentService.listComments();
        return new ResponseEntity<String>("Comments found! \n" + comments, HttpStatus.OK);
    }
    @RequestMapping(value = "/Comment/listByCourse/{idCourse}", method = RequestMethod.GET)
    public ResponseEntity<?> getAllCommentsfromCourse(@PathVariable("idCourse") Long idCourse){
        Optional<Course> optionalCourse = courseService.findCourseById(idCourse);

        if (!optionalCourse.isPresent()){
            return ErroCourse.erroCourseNotFound();
        }
        List<Comment> comments = commentService.listCommentByCourse(idCourse);
        return new ResponseEntity<String>("Comments Found! \n" + comments, HttpStatus.FOUND);

    }

    @RequestMapping(value = "/Comment/{id}", method = RequestMethod.GET)
    public ResponseEntity<?> getComment(@PathVariable("id") Long id){
        Optional<Comment> optionalComment = commentService.findCommentById(id);

        if(!optionalComment.isPresent())
            return ErroComment.erroCommentNotFound();

        return new ResponseEntity<String>("Comment found! \n" + optionalComment, HttpStatus.FOUND);
    }

    @RequestMapping(value = "/Comment/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<?> removeComment(@PathVariable ("id") Long id){
        Optional<Comment> optionalComment = commentService.findCommentById(id);

        if(!optionalComment.isPresent())
            return ErroComment.erroCommentNotFound();

        try{
            commentService.removeComment(id);
            return new ResponseEntity<String>("Comment succesfully deleted \n" + optionalComment, HttpStatus.OK);
        }catch (Error e ){
            return new ResponseEntity<CustomErrorType>(
                    new CustomErrorType("Error, comment can´t be deleted"), HttpStatus.BAD_REQUEST);
        }

    }
}
