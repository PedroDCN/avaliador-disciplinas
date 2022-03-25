package com.engSoft.controllers;

import com.engSoft.DTO.TeacherDTO;
import com.engSoft.entities.Teacher;
import com.engSoft.services.TeacherService;
import com.engSoft.util.CustomErrorType;
import com.engSoft.util.ErroTeacher;
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

    @RequestMapping(value = "/admin/teacher", method = RequestMethod.POST)
    public ResponseEntity<?> createTeacher(@RequestBody TeacherDTO teacherDTO){

        if (teacherDTO.getPhoto().isEmpty() && teacherDTO.getName().isEmpty()){
            return new ResponseEntity<>(new CustomErrorType("Empty teachers are not allowed!"),HttpStatus.NOT_ACCEPTABLE);
        }
        Optional<Teacher> auxTeacher = teacherService.getTeacherByName(teacherDTO.getName());
        if(auxTeacher.isPresent()){
            return ErroTeacher.erroTeacherAlreadyExist();
        }
        try {
            this.teacherService.saveTeacher(teacherDTO);
            return new ResponseEntity<>("Teacher succesfully created! \n" + auxTeacher, HttpStatus.CREATED);
        }catch (Error e){
            return new ResponseEntity<>(new CustomErrorType("Error, this teacher can't be created!"),HttpStatus.BAD_REQUEST);
        }
    }

    @RequestMapping(value = "/admin/teacher{id}" , method = RequestMethod.PUT)
    public ResponseEntity<?> updateTeacher(@PathVariable ("id") Long id, @RequestBody TeacherDTO teacherDTO){


        Optional<Teacher> teacherOptional = this.teacherService.getTeacherById(id);

        if (!teacherOptional.isPresent()){
            return ErroTeacher.erroTeacherNotFound();
        }
        if (teacherDTO.getPhoto().isEmpty() && teacherDTO.getName().isEmpty()){
            return new ResponseEntity<>(new CustomErrorType("Empty teachers are not allowed!"),HttpStatus.NOT_ACCEPTABLE);
        }
        try {
            Optional<Teacher> updatedTeacher = this.teacherService.updateTeacher(id,teacherDTO);

            return new ResponseEntity<>(updatedTeacher, HttpStatus.OK);

        }catch (Error e){
          return  new ResponseEntity<>(new CustomErrorType("Error, this teacher can't be updated!"),HttpStatus.BAD_REQUEST);
//
        }

    }

    @RequestMapping(value = "/teachers", method = RequestMethod.GET)
    public ResponseEntity<?> getAllTeachers(){
        List<Teacher> teachers = this.teacherService.listTeachers();

        return new ResponseEntity<>(teachers, HttpStatus.ACCEPTED);
    }

    @RequestMapping(value = "/techers{name}", method = RequestMethod.GET)
    public ResponseEntity<?> getTeacherByName(@PathVariable ("name") String name){

        Optional<Teacher> teacher = this.teacherService.getTeacherByName(name);
        if(!teacher.isPresent()){
            return ErroTeacher.erroTeacherNotFound();
        }

        return new ResponseEntity<>(teacher, HttpStatus.ACCEPTED);

    }

    @RequestMapping(value = "/teachers/{id}", method = RequestMethod.GET)
    public ResponseEntity<?> getTeacher(@PathVariable ("id") Long id){

        Optional<Teacher> teacher = this.teacherService.getTeacherById(id);
        if(!teacher.isPresent()){
            return ErroTeacher.erroTeacherNotFound();
        }
        return new ResponseEntity<>(teacher, HttpStatus.ACCEPTED);
    }

    @RequestMapping(value = "/admin/teacherDelete/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<?> removeTeacher(@PathVariable ("id") Long id){

        Optional<Teacher> toBeDeletedTeacher = this.teacherService.getTeacherById(id);
        if (!toBeDeletedTeacher.isPresent()){
            return ErroTeacher.erroTeacherNotFound();
        }
        this.teacherService.removeTeacher(id);
        return new ResponseEntity<String>("Teacher sucessfuly deleted" + "\n" + toBeDeletedTeacher, HttpStatus.OK);
    }
}
