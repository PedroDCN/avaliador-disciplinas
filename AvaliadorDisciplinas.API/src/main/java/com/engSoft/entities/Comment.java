package com.engSoft.entities;

import com.engSoft.DTO.CommentDTO;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Comment {
    @Id
    @GeneratedValue
    private Long id;
    private Long idCourse;
    private Long idStudent;
    private Long idSemester;
    private String description;
    private Integer up;
    private Integer down;
    private Integer complaints;

    public Comment(CommentDTO commentDTO) {
        this.idCourse = commentDTO.getIdCourse();
        this.idStudent = commentDTO.getIdStudent();
        this.idSemester = commentDTO.getIdSemester();
        this.description = commentDTO.getDescription();
    }

    public Comment() {

    }

    public Long getId() {
        return id;
    }

    public Long getIdCourse() {
        return idCourse;
    }

    public Long getIdSemester() {
        return idSemester;
    }

    public void setIdSemester(Long idSemester) {
        this.idSemester = idSemester;
    }

    public void setIdCourse(Long idCourse) {
        this.idCourse = idCourse;
    }

    public Long getIdStudent() {
        return idStudent;
    }

    public void setIdStudent(Long idStudent) {
        this.idStudent = idStudent;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getUp() {
        return up;
    }

    public void setUp(Integer up) {
        this.up = up;
    }

    public Integer getDown() {
        return down;
    }

    public void setDown(Integer down) {
        this.down = down;
    }

    public Integer getComplaints() {
        return complaints;
    }

    public void setComplaints(Integer complaints) {
        this.complaints = complaints;
    }

    @Override
    public String toString() {
        return "Comment{" +
                "id=" + id +
                ", idCourse=" + idCourse +
                ", idStudent=" + idStudent +
                ", description='" + description + '\'' +
                ", up=" + up +
                ", down=" + down +
                '}';
    }
}
