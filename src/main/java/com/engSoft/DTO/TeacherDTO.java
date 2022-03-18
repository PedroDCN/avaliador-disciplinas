package com.engSoft.DTO;

import com.engSoft.entities.Teacher;

public class TeacherDTO {

    private String name;

    public TeacherDTO(){}

    public TeacherDTO(String name) {
        this.name = name;
    }
    public TeacherDTO(Teacher teacher){
        this.name = teacher.getName();
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
