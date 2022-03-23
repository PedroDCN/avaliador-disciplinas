package com.engSoft.DTO;

public class SimpleCourseDTO {

    private Long id;
    private String name;
    private String nameTeacher;
    private double grade;

    public SimpleCourseDTO(Long id, String name, String nameTeacher, double grade) {
        this.id = id;
        this.name = name;
        this.nameTeacher = nameTeacher;
        this.grade = grade;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getNameTeacher() {
        return nameTeacher;
    }

    public double getGrade() {
        return grade;
    }
}
