package com.engSoft.DTO;

import com.engSoft.entities.Student;

public class StudentDTO {

    private String name;
    private String email;

    public StudentDTO(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public StudentDTO(Student student) {
        this.name = student.getName();
        this.email = student.getEmail();
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
