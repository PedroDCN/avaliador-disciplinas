package com.engSoft.AvaliadorDisciplinas.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Comment {
    @Id
    @GeneratedValue
    private Long id;
    @ManyToOne
    private Long idStudent;
    @ManyToOne
    private Long idCourse;

    private String description;

    private Number up;

    private Number down;

    public Comment() {
    }

    public Comment(Long idStudent, Long idCourse, String description) {
        this.idStudent = idStudent;
        this.idCourse = idCourse;
        this.description = description;
    }

    public Long getId() {
        return id;
    }

    public Long getIdStudent() {
        return idStudent;
    }

    public void setIdStudent(Long idStudent) {
        this.idStudent = idStudent;
    }

    public Long getIdCourse() {
        return idCourse;
    }

    public void setIdCourse(Long idCourse) {
        this.idCourse = idCourse;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Number getUp() {
        return up;
    }

    public void setUp(Number up) {
        this.up = up;
    }

    public Number getDown() {
        return down;
    }

    public void setDown(Number down) {
        this.down = down;
    }

    @Override
    public String toString() {
        return "Comment{" +
                "id=" + id +
                ", idStudent=" + idStudent +
                ", idCourse=" + idCourse +
                ", description='" + description + '\'' +
                ", up=" + up +
                ", down=" + down +
                '}';
    }
}
