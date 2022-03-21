

package com.engSoft.util;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

public class ErroCourse {
    static final String COURSE_NOT_FOUND = "Course not found";


    public static ResponseEntity<CustomErrorType> erroCourseNotFound() {
        return new ResponseEntity<CustomErrorType>(
                new CustomErrorType(ErroCourse.COURSE_NOT_FOUND), HttpStatus.NOT_FOUND);
    }


}