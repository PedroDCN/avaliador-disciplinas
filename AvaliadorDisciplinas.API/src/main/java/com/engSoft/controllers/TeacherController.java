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

import static com.engSoft.util.ErroTeacher.erroTeacherAlreadyExist;
import static com.engSoft.util.ErroTeacher.erroTeacherNotFound;

@RestController
@RequestMapping("/api")
@CrossOrigin
public class TeacherController {

    @Autowired
    TeacherService teacherService;

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

    @RequestMapping(value = "/teachers", method = RequestMethod.GET)
    public ResponseEntity<?> getAllTeachers(){
        List<Teacher> teachers = this.teacherService.listTeachers();
        return new ResponseEntity<>(teachers, HttpStatus.OK);
    }

    @RequestMapping(value = "/techers{name}", method = RequestMethod.GET)
    public ResponseEntity<?> getTeacherByName(@PathVariable ("name") String name){
        Optional<Teacher> teacher = this.teacherService.getTeacherByName(name);
        if (teacher.isPresent()){
            return new ResponseEntity<>(teacher, HttpStatus.ACCEPTED);
        }
        return erroTeacherNotFound();
    }

    @RequestMapping(value = "/teachers/{id}", method = RequestMethod.GET)
    public ResponseEntity<?> getTeacher(@PathVariable ("id") Long id){

        Optional<Teacher> teacher = this.teacherService.getTeacherById(id);
        if (teacher.isPresent()){
            return new ResponseEntity<>(teacher, HttpStatus.ACCEPTED);
        }
        return erroTeacherNotFound();
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
