package com.engSoft.controllers;

import com.engSoft.DTO.CourseDTO;
import com.engSoft.DTO.SimpleCourseDTO;
import com.engSoft.entities.Course;
import com.engSoft.entities.Teacher;
import com.engSoft.services.CourseService;
import com.engSoft.services.TeacherService;
import com.engSoft.util.ErroCourse;
import com.engSoft.util.ErroTeacher;
import com.engSoft.util.Util;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
@CrossOrigin
public class CourseController {

    @Autowired
    CourseService courseService;

    @Autowired
    TeacherService teacherService;

    @RequestMapping(value = "/Courses", method = RequestMethod.GET)
    public ResponseEntity<?> getAllCourses(){
        List<SimpleCourseDTO> courses = this.courseService.listCourses();
        return new ResponseEntity<>(courses, HttpStatus.OK);
    }

    @RequestMapping(value = "/Courses/{filter}", method = RequestMethod.GET)
    public ResponseEntity<?> getAllCoursesFilter(@PathVariable("filter") Util.FilterEnum filter){
        List<SimpleCourseDTO> courses = this.courseService.listCoursesFilter(filter);
        return new ResponseEntity<>(courses, HttpStatus.OK);
    }

    @RequestMapping(value = "/CoursesTeacher/{nameTeacher}", method = RequestMethod.GET)
    public ResponseEntity<?> getAllCoursesfromTeacher(@PathVariable("nameTeacher") String nameTeacher){
        Optional<Teacher> optionalTeacher = teacherService.getTeacherByName(nameTeacher);

        if (optionalTeacher.isPresent()) {
            List<Course> courses = this.courseService.listCoursesTeacher(optionalTeacher.get());
            return new ResponseEntity<>(courses, HttpStatus.OK);
        } else
            return ErroTeacher.erroTeacherNotFound();
    }

    @RequestMapping(value = "/Course/{id}", method = RequestMethod.GET)
    public ResponseEntity<?> getCourse(@PathVariable("id") Long id){
        Optional<Course> optionalCourse = courseService.findCourseById(id);

        if(optionalCourse.isPresent())
            return new ResponseEntity<>(optionalCourse.get(), HttpStatus.ACCEPTED);
        else
            return ErroCourse.erroCourseNotFound();
    }
}
