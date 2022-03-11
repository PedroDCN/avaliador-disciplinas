package com.engSoft.controllers;

import com.engSoft.DTO.TeacherDTO;
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

    @RequestMapping(value = "/teacher", method = RequestMethod.POST)
    public ResponseEntity<?> createTeacher(@RequestBody TeacherDTO teacherDTO){

//        TeacherDTO teacherDTO = new TeacherDTO(name);
        Teacher newTeacher = new Teacher(teacherDTO);
        Optional<Teacher> auxTeacher = teacherService.getTeacherByName(newTeacher.getName());
        if(auxTeacher.isPresent()){
            return new ResponseEntity<>("Teacher already exists! \n",HttpStatus.CONFLICT);
        }
        this.teacherService.saveTeacher(newTeacher);
        return new ResponseEntity<String>("Teacher succesfully created! \n" + newTeacher.toString(), HttpStatus.CREATED);
    }

    @RequestMapping(value = "/teacher{id}" , method = RequestMethod.PUT)
    public ResponseEntity<?> updateTeacher(@PathVariable ("id") String name){
        return new ResponseEntity<String>("Teacher succesfully updated! \n", HttpStatus.OK);
    }
    @RequestMapping(value = "/teachers", method = RequestMethod.GET)
    public ResponseEntity<?> getAllTeachers(){
        List<Teacher> teachers = this.teacherService.listTeachers();
        return new ResponseEntity<String>("Ok! \n" + teachers, HttpStatus.OK);
    }
    @RequestMapping(value = "/techers{name}", method = RequestMethod.GET)
    public ResponseEntity<?> getTeacherByName(@PathVariable ("name") String name){
        Optional<Teacher> teacher = this.teacherService.getTeacherByName(name);
        return new ResponseEntity<String>("Teacher found! \n" + teacher.toString(), HttpStatus.ACCEPTED);
    }

    @RequestMapping(value = "/teachers/{id}", method = RequestMethod.GET)
    public ResponseEntity<?> getTeacher(@PathVariable ("id") Long id){

        Optional<Teacher> teacher = this.teacherService.getTeacherById(id);
        return new ResponseEntity<String>("Teacher found! \n" + teacher.toString(), HttpStatus.ACCEPTED);
    }

    @RequestMapping(value = "teacherDelete/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<?> removeTeacher(@PathVariable ("id") Long id){

        Optional<Teacher> toBeDeletedTeacher = this.teacherService.getTeacherById(id);
        this.teacherService.removeTeacher(toBeDeletedTeacher.get());
        return new ResponseEntity<String>("Teacher succesfully deleted \n" + toBeDeletedTeacher.toString(),HttpStatus.OK);
    }
}
