package com.engSoft.entities;

import com.engSoft.DTO.TeacherDTO;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Teacher {
    @Id
    @GeneratedValue
    private Long id;
    private String name;


    public Teacher() {
    }
    public Teacher(TeacherDTO teacherDTO){
        this.name = teacherDTO.getName();
    }

    public Teacher(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "id=" + id + ", name= " + name + " }";
    }
}
