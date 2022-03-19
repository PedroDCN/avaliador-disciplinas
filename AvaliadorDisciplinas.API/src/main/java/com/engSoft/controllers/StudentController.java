package com.engSoft.controllers;

import com.engSoft.DTO.UserDTO;
import com.engSoft.entities.User;
import com.engSoft.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

import static com.engSoft.util.ErroUser.erroUserAlreadyExist;
import static com.engSoft.util.ErroUser.erroUserNotFound;

@RestController
@RequestMapping("/api")
@CrossOrigin
public class StudentController {

    @Autowired
    UserService userService;

    @RequestMapping(value = "/student", method = RequestMethod.POST)
    public ResponseEntity<?> createStudent(@RequestBody UserDTO userDTO){

        User newUser = new User(userDTO);
        Optional<User> possibleStudent = userService.getUserByEmail(newUser.getEmail());
        if (possibleStudent.isPresent()) {
            return erroUserAlreadyExist();
        }
        this.userService.saveUser(newUser);
        return new ResponseEntity<>(newUser, HttpStatus.CREATED);
    }

    @RequestMapping(value = "/students", method = RequestMethod.GET)
    public ResponseEntity<?> getAllStudents(){
        List<User> users = this.userService.listUsers();
        return new ResponseEntity<>(users, HttpStatus.OK);
    }

    @RequestMapping(value = "/students/{id}", method = RequestMethod.GET)
    public ResponseEntity<?> getStudent(@PathVariable ("id") Long id){

        Optional<User> student = this.userService.getUserById(id);
        if (student.isPresent()) {
            return new ResponseEntity<>(student, HttpStatus.ACCEPTED);
        }
        return erroUserNotFound();
    }

    @RequestMapping(value = "/students/email/{email}", method = RequestMethod.GET)
    public ResponseEntity<?> getStudentByEmail(@PathVariable ("email") String email){

        Optional<User> student = this.userService.getUserByEmail(email);
        if (student.isPresent()) {
            return new ResponseEntity<>(student, HttpStatus.ACCEPTED);
        }
        return erroUserNotFound();
    }

    @RequestMapping(value = "studentDelete/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<?> removeStudent(@PathVariable ("id") Long id){

        Optional<User> toBeDeletedStudent = this.userService.getUserById(id);
        if (toBeDeletedStudent.isPresent()) {
            this.userService.removeUser(toBeDeletedStudent.get());
            return new ResponseEntity<>(toBeDeletedStudent, HttpStatus.OK);
        }
        return erroUserNotFound();
    }
}