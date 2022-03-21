

package com.engSoft.util;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

public class ErroUser {
    static final String STUDENT_NOT_FOUND = "Student not found";
    static final String STUDENT_ALREADY_EXISTS = "Student Already Exists";


    public static ResponseEntity<CustomErrorType> erroUserNotFound() {
        return new ResponseEntity<CustomErrorType>(
                new CustomErrorType(ErroUser.STUDENT_NOT_FOUND), HttpStatus.NOT_FOUND);
    }

    public static ResponseEntity<CustomErrorType> erroUserAlreadyExist() {
        return new ResponseEntity<CustomErrorType>(
                new CustomErrorType(ErroUser.STUDENT_ALREADY_EXISTS), HttpStatus.CONFLICT);
    }


}