package com.engSoft.controllers;

import com.engSoft.DTO.CourseDTO;
import com.engSoft.entities.Course;
import com.engSoft.entities.Teacher;
import com.engSoft.services.CourseService;
import com.engSoft.services.TeacherService;
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

    @RequestMapping(value = "/Course", method = RequestMethod.POST)
    public ResponseEntity<?> createCourse(@RequestBody CourseDTO courseDTO) {
        Optional<Teacher> optionalTeacher = teacherService.getTeacherByName(courseDTO.getNameTeacher());

        if (optionalTeacher.isPresent()) {
            Course newCourse = new Course(courseDTO, optionalTeacher.get().getId());
            courseService.saveCourse(newCourse);

            return new ResponseEntity<String>("Course succesfully created! \n" + newCourse, HttpStatus.CREATED);
        } else
            return new ResponseEntity<String>("Teacher does not exist \n", HttpStatus.NOT_FOUND);
    }

    @RequestMapping(value = "/CourseUpdate/{id}", method = RequestMethod.POST)
    public ResponseEntity<?> updateCourse(@PathVariable("id") Long id, @RequestBody CourseDTO courseDTO) {
        Optional<Teacher> optionalTeacher = teacherService.getTeacherByName(courseDTO.getNameTeacher());

        if(!optionalTeacher.isPresent())
            return new ResponseEntity<String>("Teacher does not exist \n", HttpStatus.NOT_FOUND);

        Optional<Course> optionalCourse = courseService.findCourseById(id);

        if(optionalCourse.isPresent()) {
            optionalCourse.get().update(courseDTO, optionalTeacher.get().getId());
            courseService.saveCourse(optionalCourse.get());

            return new ResponseEntity<String>("Course succesfully updated! \n" + optionalCourse, HttpStatus.CREATED);
        } else
            return new ResponseEntity<String>("Course does not exist \n", HttpStatus.NOT_FOUND);
    }

    @RequestMapping(value = "/Courses", method = RequestMethod.GET)
    public ResponseEntity<?> getAllCourses(){
        List<Course> courses = this.courseService.listCourses();
        return new ResponseEntity<String>("Ok! \n" + courses, HttpStatus.OK);
    }

    @RequestMapping(value = "/CoursesTeacher/{nameTeacher}", method = RequestMethod.GET)
    public ResponseEntity<?> getAllCoursesfromTeacher(@PathVariable("nameTeacher") String nameTeacher){
        Optional<Teacher> optionalTeacher = teacherService.getTeacherByName(nameTeacher);

        if (optionalTeacher.isPresent()) {
            List<Course> courses = this.courseService.listCoursesTeacher(optionalTeacher.get().getId());
            return new ResponseEntity<String>("Ok! \n" + courses, HttpStatus.OK);
        } else
            return new ResponseEntity<String>("Teacher does not exist", HttpStatus.NOT_FOUND);
    }

    @RequestMapping(value = "/Courses/{id}", method = RequestMethod.GET)
    public ResponseEntity<?> getCourse(@PathVariable("id") Long id){
        Optional<Course> optionalCourse = courseService.findCourseById(id);

        if(optionalCourse.isPresent())
            return new ResponseEntity<String>("Course found! \n" + optionalCourse, HttpStatus.ACCEPTED);
        else
            return new ResponseEntity<String>("Course does not exist \n", HttpStatus.NOT_FOUND);
    }

    @RequestMapping(value = "CourseDelete/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<?> removeCourse(@PathVariable ("id") Long id){
        Optional<Course> optionalCourse = courseService.findCourseById(id);

        if(optionalCourse.isPresent()) {
            courseService.removeCourse(optionalCourse.get());
            return new ResponseEntity<String>("Course succesfully deleted \n" + optionalCourse, HttpStatus.OK);
        } else
            return new ResponseEntity<String>("Course does not exist \n", HttpStatus.NOT_FOUND);
    }
}
