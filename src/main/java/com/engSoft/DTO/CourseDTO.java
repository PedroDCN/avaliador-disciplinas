package com.engSoft.DTO;

public class CourseDTO {

    private String name;
    private String code;
    private String nameTeacher;
    private String initialTime;
    private String finalTime;

    public CourseDTO(String name, String code, String nameTeacher, String initialTime, String finalTime) {
        this.name = name;
        this.code = code;
        this.nameTeacher = nameTeacher;
        this.initialTime = initialTime;
        this.finalTime = finalTime;
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

    public String getInitialTime() {
        return initialTime;
    }

    public String getFinalTime() {
        return finalTime;
    }
}
