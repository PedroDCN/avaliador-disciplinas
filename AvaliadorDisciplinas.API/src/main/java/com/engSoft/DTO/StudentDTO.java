package com.engSoft.DTO;

public class StudentDTO {

    private String name;
    private String email;
    private String nick;
    private Boolean isBanned;
    private int deletedComments;

    public StudentDTO(String name, String email) {
        this.name = name;
        this.email = email;
        this.isBanned = false;
        this.deletedComments = 0;

        this.nick = email.substring(0, email.indexOf('@'));
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
}
