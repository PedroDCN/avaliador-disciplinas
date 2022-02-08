package com.engSoft.AvaliadorDisciplinas.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Reaction {
    @Id
    @GeneratedValue
    private Long id;

    @ManyToOne
    private Long idComment;

    @ManyToOne
    private Long idStudent;

    private Boolean isLike;

    public Reaction() {
    }

    public Reaction(Long idComment, Long idStudent, Boolean isLike) {
        this.idComment = idComment;
        this.idStudent = idStudent;
        this.isLike = isLike;
    }

    public Long getId() {
        return id;
    }

    public Long getIdComment() {
        return idComment;
    }

    public void setIdComment(Long idComment) {
        this.idComment = idComment;
    }

    public Long getIdStudent() {
        return idStudent;
    }

    public void setIdStudent(Long idStudent) {
        this.idStudent = idStudent;
    }

    public Boolean getLike() {
        return isLike;
    }

    public void setLike(Boolean like) {
        isLike = like;
    }

    @Override
    public String toString() {
        return "Reaction{" +
                "id=" + id +
                ", idComment=" + idComment +
                ", idStudent=" + idStudent +
                ", isLike=" + isLike +
                '}';
    }
}
