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

    @RequestMapping(value = "/admin/CourseDelete/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<?> removeCourse(@PathVariable ("id") Long id){
        Optional<Course> optionalCourse = courseService.findCourseById(id);

        if(optionalCourse.isPresent()) {
            courseService.removeCourse(optionalCourse.get());
            return new ResponseEntity<>(optionalCourse.get(), HttpStatus.OK);
        } else
            return ErroCourse.erroCourseNotFound();
    }
}
