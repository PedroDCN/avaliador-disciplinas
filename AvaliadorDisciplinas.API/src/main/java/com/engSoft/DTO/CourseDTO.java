package com.engSoft.DTO;

public class CourseDTO {

    private String name;
    private String code;
    private String nameTeacher;
    private String semester;

    public CourseDTO(String name, String code, String nameTeacher, String semester) {
        this.name = name;
        this.code = code;
        this.nameTeacher = nameTeacher;
        this.semester = semester;
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

    public String getSemester() { return semester; }
}
