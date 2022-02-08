package com.engSoft.AvaliadorDisciplinas.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Report {
    @Id
    @GeneratedValue
    private Long id;

    @ManyToOne
    private Long idStudent;

    @ManyToOne
    private Long idComment;

    private String description;

    public Report(Long idStudent, Long idComment, String description) {
        this.idStudent = idStudent;
        this.idComment = idComment;
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

    public Long getIdComment() {
        return idComment;
    }

    public void setIdComment(Long idComment) {
        this.idComment = idComment;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Report{" +
                "id=" + id +
                ", idStudent=" + idStudent +
                ", idComment=" + idComment +
                ", description='" + description + '\'' +
                '}';
    }
}
