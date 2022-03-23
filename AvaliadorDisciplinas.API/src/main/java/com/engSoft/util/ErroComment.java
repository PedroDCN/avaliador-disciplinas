package com.engSoft.util;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

public class ErroComment {
    static final String COMMENT_NOT_FOUND = "Comment not found";
    static final String COMMENT_NOT_ACCESSIBLE="Reaction not accessible";


    public static ResponseEntity<CustomErrorType> erroCommentNotFound() {
        return new ResponseEntity<>(
                new CustomErrorType(ErroComment.COMMENT_NOT_FOUND), HttpStatus.NOT_FOUND);
    }
    public static ResponseEntity<CustomErrorType> erroCommentNotAccessible() {
        return new ResponseEntity<>(
                new CustomErrorType(ErroComment.COMMENT_NOT_ACCESSIBLE), HttpStatus.FORBIDDEN);
    }

}
