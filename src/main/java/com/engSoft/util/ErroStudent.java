

package com.engSoft.util;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

public class ErroStudent {
    static final String STUDENT_NOT_FOUND = "Student not found";


    public static ResponseEntity<CustomErrorType> erroStudentNotFound() {
        return new ResponseEntity<CustomErrorType>(
                new CustomErrorType(ErroStudent.STUDENT_NOT_FOUND), HttpStatus.NOT_FOUND);
    }


}