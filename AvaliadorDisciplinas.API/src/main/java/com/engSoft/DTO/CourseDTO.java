package com.engSoft.DTO;

public class CourseDTO {

    private final String name;
    private final String code;
    private final String nameTeacher;

    public CourseDTO(String name, String code, String nameTeacher) {
        this.name = name;
        this.code = code;
        this.nameTeacher = nameTeacher;
    }

    public String getName() {
        return name;
    }

    public String getCode() {
        return code;
    }

    public String getNameTeacher() {
        return nameTeacher;
    }
}
