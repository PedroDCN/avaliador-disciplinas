package com.engSoft.DTO;

import com.engSoft.entities.Comment;

public class ReturnCommentDTO {

    private final Long id;
    private final Long idCourse;
    private final String nomeCourse;
    private final Long idStudent;
    private final String nameStudent;
    private final String photoStudent;
    private final Long idSemester;
    private final String description;
    private final Integer up;
    private final Integer down;
    private final Integer complaints;

    public ReturnCommentDTO(Comment comment) {
        this.id = comment.getId();
        this.idCourse = comment.getCourse().getId();
        this.nomeCourse = comment.getCourse().getName();
        this.idStudent = idStudent;
        this.nameStudent = nameStudent;
        this.photoStudent = photoStudent;
        this.idSemester = idSemester;
        this.description = description;
        this.up = up;
        this.down = down;
        this.complaints = complaints;
    }
}
