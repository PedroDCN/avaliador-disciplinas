package com.engSoft.DTO;

import com.engSoft.entities.Course;

public class ReturnCourseDTO {

    private final Long id;
    private final String name;
    private final String code;
    private final Long idTeacher;
    private final String nameTeacher;
    private final double grade;

    public ReturnCourseDTO(Course course) {
        this.id = course.getId();
        this.name = course.getName();
        this.code = course.getCode();
        this.idTeacher = course.getTeacher().getId();
        this.nameTeacher = course.getTeacher().getName();
        this.grade = course.getGrade();
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

    public String getNameTeacher() {
        return nameTeacher;
    }

    public double getGrade() {
        return grade;
    }
}
