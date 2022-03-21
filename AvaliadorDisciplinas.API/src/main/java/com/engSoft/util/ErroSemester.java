

package com.engSoft.util;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

public class ErroSemester {
    static final String SEMESTER_NOT_FOUND = "Semester not found";


    public static ResponseEntity<CustomErrorType> erroSemesterNotFound() {
        return new ResponseEntity<CustomErrorType>(
                new CustomErrorType(ErroSemester.SEMESTER_NOT_FOUND), HttpStatus.NOT_FOUND);
    }


}