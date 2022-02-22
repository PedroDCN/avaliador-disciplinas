

package com.engSoft.util;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

public class ErroStudent {
    static final String STUDENT_NOT_FOUNG = "Student not found";


    public static ResponseEntity<CustomErrorType> erroStudentNotFound() {
        return new ResponseEntity<CustomErrorType>(
                new CustomErrorType(ErroStudent.STUDENT_NOT_FOUNG), HttpStatus.NOT_FOUND);
    }


}