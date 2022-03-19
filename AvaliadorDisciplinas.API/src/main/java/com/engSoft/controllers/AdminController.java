package com.engSoft.controllers;

import com.engSoft.DTO.CourseDTO;
import com.engSoft.DTO.TeacherDTO;
import com.engSoft.entities.Comment;
import com.engSoft.entities.Course;
import com.engSoft.entities.Teacher;
import com.engSoft.entities.User;
import com.engSoft.services.CommentService;
import com.engSoft.services.CourseService;
import com.engSoft.services.TeacherService;
import com.engSoft.services.UserService;
import com.engSoft.util.CustomErrorType;
import com.engSoft.util.ErroComment;
import com.engSoft.util.ErroCourse;
import com.engSoft.util.ErroTeacher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

import static com.engSoft.util.ErroTeacher.erroTeacherAlreadyExist;
import static com.engSoft.util.ErroTeacher.erroTeacherNotFound;
import static com.engSoft.util.ErroUser.erroUserNotFound;

@RestController
@RequestMapping("/api")
@CrossOrigin
public class AdminController {

    @Autowired
    UserService userService;

    @Autowired
    CourseService courseService;

    @Autowired
    TeacherService teacherService;

    @Autowired
    CommentService commentService;

    @RequestMapping(value = "/admin/{email}", method = RequestMethod.PUT)
    public ResponseEntity<?> updateUserForAdmin(@PathVariable ("email") String email, @RequestParam Boolean isAdmin){

        Optional<User> user = this.userService.getUserByEmail(email);
        if (user.isPresent()) {
            user.get().setIsAdmin(isAdmin);
            userService.saveUser(user.get());
            return new ResponseEntity<>(user, HttpStatus.OK);
        }
        return erroUserNotFound();
    }

    @RequestMapping(value = "/admin/Course", method = RequestMethod.POST)
    public ResponseEntity<?> createCourse(@RequestBody CourseDTO courseDTO) {
        Optional<Teacher> optionalTeacher = teacherService.getTeacherByName(courseDTO.getNameTeacher());

        if (optionalTeacher.isPresent()) {
            Course newCourse = new Course(courseDTO, optionalTeacher.get());
            courseService.saveCourse(newCourse);

            return new ResponseEntity<>(newCourse, HttpStatus.CREATED);
        } else
            return ErroTeacher.erroTeacherNotFound();
    }

    @RequestMapping(value = "/admin/CourseUpdate/{id}", method = RequestMethod.PATCH)
    public ResponseEntity<?> updateCourse(@PathVariable("id") Long id, @RequestBody CourseDTO courseDTO) {
        Optional<Teacher> optionalTeacher = teacherService.getTeacherByName(courseDTO.getNameTeacher());

        if(!optionalTeacher.isPresent())
            return ErroTeacher.erroTeacherNotFound();

        Optional<Course> optionalCourse = courseService.findCourseById(id);

        if(optionalCourse.isPresent()) {
            optionalCourse.get().update(courseDTO, optionalTeacher.get());
            courseService.saveCourse(optionalCourse.get());

            return new ResponseEntity<>(optionalCourse, HttpStatus.CREATED);
        } else
            return ErroCourse.erroCourseNotFound();
    }

    @RequestMapping(value = "/admin/CourseDelete/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<?> removeCourse(@PathVariable ("id") Long id){
        Optional<Course> optionalCourse = courseService.findCourseById(id);

        if(optionalCourse.isPresent()) {
            courseService.removeCourse(optionalCourse.get());
            return new ResponseEntity<>(optionalCourse.get(), HttpStatus.OK);
        } else
            return ErroCourse.erroCourseNotFound();
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

    @RequestMapping(value = "/admin/Teacher", method = RequestMethod.POST)
    public ResponseEntity<?> createTeacher(@RequestBody TeacherDTO teacherDTO){

//        TeacherDTO teacherDTO = new TeacherDTO(name);
        Teacher newTeacher = new Teacher(teacherDTO);
        Optional<Teacher> auxTeacher = teacherService.getTeacherByName(newTeacher.getName());
        if(auxTeacher.isPresent()){
            return erroTeacherAlreadyExist();
        }
        this.teacherService.saveTeacher(newTeacher);
        return new ResponseEntity<>(newTeacher, HttpStatus.CREATED);
    }

    @RequestMapping(value = "/admin/Teacher/{id}" , method = RequestMethod.PUT)
    public ResponseEntity<?> updateTeacher(@PathVariable ("id") String name){
        return new ResponseEntity<>("Teacher succesfully updated! \n", HttpStatus.OK);
    }

    @RequestMapping(value = "/admin/TeacherDelete/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<?> removeTeacher(@PathVariable ("id") Long id){

        Optional<Teacher> toBeDeletedTeacher = this.teacherService.getTeacherById(id);
        if (toBeDeletedTeacher.isPresent())
        {
            this.teacherService.removeTeacher(toBeDeletedTeacher.get());
            return new ResponseEntity<>(toBeDeletedTeacher.get() ,HttpStatus.OK);
        }
        return erroTeacherNotFound();
    }

}
