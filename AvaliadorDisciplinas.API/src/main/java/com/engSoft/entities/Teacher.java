package com.engSoft.entities;

import com.engSoft.DTO.TeacherDTO;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class Teacher implements Comparable<Teacher> {
    @Id
    @GeneratedValue
    private Long id;
    private String name;

    private String photo;


    public Teacher() {
    }

    public Teacher(TeacherDTO teacherDTO){
        this.name = teacherDTO.getName();
        this.photo = teacherDTO.getPhoto();
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

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "id=" + id + ", name= " + name + " }";
    }

    @Override
    public int compareTo(Teacher o) {
        return this.name.compareTo(o.getName());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Teacher teacher = (Teacher) o;
        return name.equals(teacher.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
