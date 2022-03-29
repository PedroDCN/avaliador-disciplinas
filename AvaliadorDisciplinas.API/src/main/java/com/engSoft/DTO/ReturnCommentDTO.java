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

    public Long getId() {
        return id;
    }

    public Long getIdCourse() {
        return idCourse;
    }

    public String getNomeCourse() {
        return nomeCourse;
    }

    public Long getIdStudent() {
        return idStudent;
    }

    public String getNameStudent() {
        return nameStudent;
    }

    public String getPhotoStudent() {
        return photoStudent;
    }

    public Long getIdSemester() {
        return idSemester;
    }

    public String getDescription() {
        return description;
    }

    public Integer getUp() {
        return up;
    }

    public Integer getDown() {
        return down;
    }

    public Integer getComplaints() {
        return complaints;
    }
}
