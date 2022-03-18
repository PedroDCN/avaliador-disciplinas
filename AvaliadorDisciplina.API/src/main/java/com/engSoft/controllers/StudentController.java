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

import static com.engSoft.util.ErroStudent.erroStudentAlreadyExist;
import static com.engSoft.util.ErroStudent.erroStudentNotFound;

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
            return erroStudentAlreadyExist();
        }
        this.studentService.saveStudent(newStudent);
        return new ResponseEntity<>(newStudent, HttpStatus.CREATED);
    }

    @RequestMapping(value = "/students", method = RequestMethod.GET)
    public ResponseEntity<?> getAllStudents(){
        List<Student> students = this.studentService.listStudents();
        return new ResponseEntity<>(students, HttpStatus.OK);
    }

    @RequestMapping(value = "/students/{id}", method = RequestMethod.GET)
    public ResponseEntity<?> getStudent(@PathVariable ("id") Long id){

        Optional<Student> student = this.studentService.getStudentById(id);
        if (student.isPresent()) {
            return new ResponseEntity<>(student, HttpStatus.ACCEPTED);
        }
        return erroStudentNotFound();
    }

    @RequestMapping(value = "/students/email/{email}", method = RequestMethod.GET)
    public ResponseEntity<?> getStudentByEmail(@PathVariable ("email") String email){

        Optional<Student> student = this.studentService.getStudentByEmail(email);
        if (student.isPresent()) {
            return new ResponseEntity<>(student, HttpStatus.ACCEPTED);
        }
        return erroStudentNotFound();
    }

    @RequestMapping(value = "studentDelete/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<?> removeStudent(@PathVariable ("id") Long id){

        Optional<Student> toBeDeletedStudent = this.studentService.getStudentById(id);
        if (toBeDeletedStudent.isPresent()) {
            this.studentService.removeStudent(toBeDeletedStudent.get());
            return new ResponseEntity<>(toBeDeletedStudent, HttpStatus.OK);
        }
        return erroStudentNotFound();
    }
}