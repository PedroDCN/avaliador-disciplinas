

package com.engSoft.util;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

public class ErroFeedback {
    static final String FEEDBACK_NOT_FOUND = "Feedback not found";


    public static ResponseEntity<CustomErrorType> erroFeedbackNotFound() {
        return new ResponseEntity<>(
                new CustomErrorType(ErroFeedback.FEEDBACK_NOT_FOUND), HttpStatus.NOT_FOUND);
    }


}