package com.engSoft.util;

import com.engSoft.entities.Course;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

public class ErroSimulation {
    static final String COURSE_NOT_FOUND = "Course not found from id %s";


    public static ResponseEntity<CustomErrorType> erroCourseNotFound(Long c) {
        return new ResponseEntity<>(
                new CustomErrorType(String.format(ErroSimulation.COURSE_NOT_FOUND, c)), HttpStatus.NOT_FOUND);
    }

}
