package com.engSoft.AvaliadorDisciplinas.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Student {
    @Id
    @GeneratedValue
    private Long id;

    private Boolean isBanned;

    private String email;

    private String name;

    private String nick;

    private Number deletedComments;

    public Student() {
    }

    public Student(Boolean isBanned, String email, String name, String nick, Number deletedComments) {
        this.isBanned = isBanned;
        this.email = email;
        this.name = name;
        this.nick = nick;
        this.deletedComments = deletedComments;
    }

    public Long getId() {
        return id;
    }

    public Boolean getBanned() {
        return isBanned;
    }

    public void setBanned(Boolean banned) {
        isBanned = banned;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public Number getDeletedComments() {
        return deletedComments;
    }

    public void setDeletedComments(Number deletedComments) {
        this.deletedComments = deletedComments;
    }
}
