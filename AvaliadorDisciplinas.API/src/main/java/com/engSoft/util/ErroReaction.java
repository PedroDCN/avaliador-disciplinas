package com.engSoft.util;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

public class ErroReaction {
    static final String REACTION_NOT_FOUND = "Reaction not found";
    static final String REACTION_NOT_ACCESSIBLE="Reaction not accessible";
    static final String INVALID_TYPE = "%s is not a valid Type for operation on %s";


    public static ResponseEntity<CustomErrorType> erroReactionNotFound() {
        return new ResponseEntity<CustomErrorType>(
                new CustomErrorType(ErroReaction.REACTION_NOT_FOUND), HttpStatus.NOT_FOUND);
    }
    public static ResponseEntity<CustomErrorType> erroReactionNotAccessible() {
        return new ResponseEntity<CustomErrorType>(
                new CustomErrorType(ErroReaction.REACTION_NOT_ACCESSIBLE), HttpStatus.FORBIDDEN);
    }

    public static ResponseEntity<?> erroInvalidTypeForOperation(String type, String complaint) {
        return new ResponseEntity<CustomErrorType>(
                new CustomErrorType(String.format(ErroReaction.INVALID_TYPE, type, complaint)), HttpStatus.FORBIDDEN);
    }
}
