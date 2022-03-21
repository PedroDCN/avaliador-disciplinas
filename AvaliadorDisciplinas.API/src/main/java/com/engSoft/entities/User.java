package com.engSoft.entities;

import com.engSoft.DTO.UserDTO;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class User {

    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String email;
    private String nick;
    private Boolean isBanned;
    private Boolean isAdmin;
    private int deletedComments;

    public User(){}

    public User(UserDTO userDTO) {
        this.name = userDTO.getName();
        this.email = userDTO.getEmail();
        this.isBanned = false;
        this.deletedComments = 0;
        this.nick = email.substring(0, email.indexOf('@'));
        this.isAdmin = false;

    }

    public Boolean getIsAdmin() {
        return isAdmin;
    }

    public void setIsAdmin(Boolean isAdmin) {
        this.isAdmin = isAdmin;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public Boolean getBanned() {
        return isBanned;
    }

    public void setBanned(Boolean banned) {
        isBanned = banned;
    }

    public int getDeletedComments() {
        return deletedComments;
    }

    public void setDeletedComments(int deletedComments) {
        this.deletedComments = deletedComments;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", nick='" + nick + '\'' +
                ", isBanned=" + isBanned +
                ", deletedComments=" + deletedComments +
                ", isAdmin=" + isAdmin +
                '}';
    }
}
