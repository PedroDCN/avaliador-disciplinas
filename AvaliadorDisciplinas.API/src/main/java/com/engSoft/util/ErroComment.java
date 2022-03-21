package com.engSoft.util;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

public class ErroComment {
    static final String COMMENT_NOT_FOUND = "Comment not found";


    public static ResponseEntity<CustomErrorType> erroCommentNotFound() {
        return new ResponseEntity<CustomErrorType>(
                new CustomErrorType(ErroComment.COMMENT_NOT_FOUND), HttpStatus.NOT_FOUND);
    }

}
