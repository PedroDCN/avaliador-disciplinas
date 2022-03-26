package com.engSoft.DTO;

public class SimpleCourseDTO {

    private final Long id;
    private final String name;
    private final Long idTeacher;
    private final double grade;

    public SimpleCourseDTO(Long id, String name, Long idTeacher, double grade) {
        this.id = id;
        this.name = name;
        this.idTeacher = idTeacher;
        this.grade = grade;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Long getIdTeacher() {
        return idTeacher;
    }

    public double getGrade() {
        return grade;
    }
}
