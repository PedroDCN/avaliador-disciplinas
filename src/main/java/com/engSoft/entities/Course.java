package com.engSoft.entities;

import com.engSoft.DTO.CourseDTO;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Course {

    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String code;
    private Long idTeacher;
    private String initialTime;
    private String finalTime;

    public Course() {}

    public Course(CourseDTO courseDTO, Long idTeacher) {
        this.name = courseDTO.getName();
        this.code = courseDTO.getCode();
        this.idTeacher = idTeacher;
        this.initialTime = courseDTO.getInitialTime();
        this.finalTime = courseDTO.getFinalTime();
    }

    public void update(CourseDTO courseDTO, Long idTeacher) {
        this.name = courseDTO.getName();
        this.code = courseDTO.getCode();
        this.idTeacher = idTeacher;
        this.initialTime = courseDTO.getInitialTime();
        this.finalTime = courseDTO.getFinalTime();
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getCode() {
        return code;
    }

    public Long getIdTeacher() {
        return idTeacher;
    }

    public String getInitialTime() {
        return initialTime;
    }

    public String getFinalTime() {
        return finalTime;
    }

    @Override
    public String toString() {
        return "Course{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", code='" + code + '\'' +
                ", idTeacher='" + idTeacher + '\''+
                ", initialTime='" + initialTime + '\'' +
                ", finalTime='" + finalTime + '\'' +
                '}';
    }
}
