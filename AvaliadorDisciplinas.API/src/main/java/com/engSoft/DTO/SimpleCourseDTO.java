package com.engSoft.DTO;

public class SimpleCourseDTO {

    private Long id;
    private String name;
    private String nameTeacher;
    private Integer grade;

    public SimpleCourseDTO(Long id, String name, String nameTeacher, Integer grade) {
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

    public Integer getGrade() {
        return grade;
    }
}
