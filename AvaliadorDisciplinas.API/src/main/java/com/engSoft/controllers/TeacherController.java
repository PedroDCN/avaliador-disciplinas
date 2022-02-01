package com.engSoft.controllers;

import com.engSoft.entities.Teacher;
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
public class TeacherController {

    @Autowired
    TeacherService teacherService;

    @RequestMapping(value = "/Teacher", method = RequestMethod.POST)
    public ResponseEntity<?> createTeacher(@PathVariable String name){

        Teacher newTeacher = new Teacher(name);
        this.teacherService.saveTeacher(newTeacher);
        return new ResponseEntity<String>("Teacher succesfully created! \n" + newTeacher.toString(), HttpStatus.CREATED);
    }

    @RequestMapping(value = "/Teachers", method = RequestMethod.GET)
    public ResponseEntity<?> getAllTeachers(){
        List<Teacher> teachers = this.teacherService.listTeachers();
        return new ResponseEntity<String>("Ok! \n" + teachers, HttpStatus.OK);
    }

    @RequestMapping(value = "/Teachers/{id}", method = RequestMethod.GET)
    public ResponseEntity<?> getTeacher(@PathVariable ("id") Long id){

        Optional<Teacher> teacher = this.teacherService.getTeacherById(id);
        return new ResponseEntity<String>("Teacher found! \n" + teacher.toString(), HttpStatus.ACCEPTED);
    }

    @RequestMapping(value = "TeacherDelete/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<?> removeTeacher(@PathVariable ("id") Long id){

        Optional<Teacher> toBeDeletedTeacher = this.teacherService.getTeacherById(id);
        this.teacherService.removeTeacher(toBeDeletedTeacher.get());
        return new ResponseEntity<String>("Teacher succesfully deleted \n" + toBeDeletedTeacher.toString(),HttpStatus.OK);
    }
}
