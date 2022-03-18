

package com.engSoft.util;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

public class ErroStudent {
    static final String STUDENT_NOT_FOUND = "Student not found";
    static final String STUDENT_ALREADY_EXISTS = "Student not found";


    public static ResponseEntity<CustomErrorType> erroStudentNotFound() {
        return new ResponseEntity<CustomErrorType>(
                new CustomErrorType(ErroStudent.STUDENT_NOT_FOUND), HttpStatus.NOT_FOUND);
    }

    public static ResponseEntity<CustomErrorType> erroStudentAlreadyExist() {
        return new ResponseEntity<CustomErrorType>(
                new CustomErrorType(ErroStudent.STUDENT_ALREADY_EXISTS), HttpStatus.CONFLICT);
    }


}