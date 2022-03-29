

package com.engSoft.util;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

public class ErroFeedback {
    static final String FEEDBACK_NOT_FOUND = "Feedback not found";

    static final String FEEDBACK_ALREADY_EXISTS = "Feedback already exists";

    public static ResponseEntity<CustomErrorType> erroFeedbackNotFound() {
        return new ResponseEntity<>(
                new CustomErrorType(ErroFeedback.FEEDBACK_NOT_FOUND), HttpStatus.NOT_FOUND);
    }

    public static ResponseEntity<CustomErrorType> erroFeedbackAlreadyExists() {
        return new ResponseEntity<>(
                new CustomErrorType(ErroFeedback.FEEDBACK_ALREADY_EXISTS), HttpStatus.CONFLICT);
    }

}