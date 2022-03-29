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
        this.idStudent = comment.getStudent().getId();
        this.nameStudent = comment.getStudent().getName();
        this.photoStudent = comment.getStudent().getPhoto_url();
        this.idSemester = comment.getSemester().getId();
        this.description = comment.getDescription();
        this.up = comment.getUp();
        this.down = comment.getDown();
        this.complaints = comment.getComplaints();
    }
}
