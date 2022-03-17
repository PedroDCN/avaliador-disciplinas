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
        Optional<Student> possibleStudent = studentService.getStudentByEmail(newStudent.getEmail());
        if (possibleStudent.isPresent()) {
            return new ResponseEntity<>("Student already exists \n", HttpStatus.CONFLICT);
        }
        this.studentService.saveStudent(newStudent);
        return new ResponseEntity<String>("Student succesfully created! \n" + newStudent.toString(), HttpStatus.CREATED);
    }

    @RequestMapping(value = "/students", method = RequestMethod.GET)
    public ResponseEntity<?> getAllStudents(){
        List<Student> students = this.studentService.listStudents();
        return new ResponseEntity<String>("Ok! \n" + students, HttpStatus.OK);
    }

    @RequestMapping(value = "/students/{id}", method = RequestMethod.GET)
    public ResponseEntity<?> getStudent(@PathVariable ("id") Long id){

        Optional<Student> student = this.studentService.getStudentById(id);
        if (student.isPresent()) {
            return new ResponseEntity<String>("Student found! \n" + student.toString(), HttpStatus.ACCEPTED);
        }
        return new ResponseEntity<>("Student does not exist \n", HttpStatus.NOT_FOUND);
    }

    @RequestMapping(value = "studentDelete/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<?> removeStudent(@PathVariable ("id") Long id){

        Optional<Student> toBeDeletedStudent = this.studentService.getStudentById(id);
        if (toBeDeletedStudent.isPresent()) {
            this.studentService.removeStudent(toBeDeletedStudent.get());
            return new ResponseEntity<String>("Student succesfully deleted \n" + toBeDeletedStudent.toString(), HttpStatus.OK);
        }
        return new ResponseEntity<>("Student does not exist \n", HttpStatus.NO_CONTENT);
    }
}