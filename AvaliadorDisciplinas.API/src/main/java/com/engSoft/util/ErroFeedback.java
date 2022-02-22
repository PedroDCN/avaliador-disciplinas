

package com.engSoft.util;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

public class ErroFeedback {
    static final String FEEDBACK_NOT_FOUNG = "Feedback not found";


    public static ResponseEntity<CustomErrorType> erroFeedbackNotFound() {
        return new ResponseEntity<CustomErrorType>(
                new CustomErrorType(ErroFeedback.FEEDBACK_NOT_FOUNG), HttpStatus.NOT_FOUND);
    }


}