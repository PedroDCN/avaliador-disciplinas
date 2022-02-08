package com.engSoft.controllers;

import com.engSoft.DTO.StudentDTO;
import com.engSoft.entities.Student;
import com.engSoft.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
@CrossOrigin
public class StudentController {

    @Autowired
    StudentService studentService;

    @RequestMapping(value = "/student", method = RequestMethod.POST)
    public ResponseEntity<?> createStudent(@RequestBody StudentDTO studentDTO){

        Student newStudent = new Student(studentDTO);
        this.studentService.saveStudent(newStudent);
        return new ResponseEntity<String>("Student succesfully created! \n" + newStudent.toString(), HttpStatus.CREATED);
    }

    @RequestMapping(value = "/students", method = RequestMethod.GET)
    public ResponseEntity<?> getAllStudents(){
        List<Student> Students = this.studentService.listStudents();
        return new ResponseEntity<String>("Ok! \n" + Students, HttpStatus.OK);
    }

    @RequestMapping(value = "/students/{id}", method = RequestMethod.GET)
    public ResponseEntity<?> getStudent(@PathVariable ("id") Long id){

        Optional<Student> Student = this.studentService.getStudentById(id);
        return new ResponseEntity<String>("Student found! \n" + Student.toString(), HttpStatus.ACCEPTED);
    }

    @RequestMapping(value = "studentDelete/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<?> removeStudent(@PathVariable ("id") Long id){

        Optional<Student> toBeDeletedStudent = this.studentService.getStudentById(id);
        this.studentService.removeStudent(toBeDeletedStudent.get());
        return new ResponseEntity<String>("Student succesfully deleted \n" + toBeDeletedStudent.toString(),HttpStatus.OK);
    }
}