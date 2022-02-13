package com.engSoft.DTO;

public class CourseDTO {

    private String name;
    private String code;
    private Long nameTeacher;
    private String initialTime;
    private String finalTime;

    public CourseDTO(String name, String code, Long nameTeacher, String initialTime, String finalTime) {
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

    public Long getNameTeacher() {
        return nameTeacher;
    }

    public String getInitialTime() {
        return initialTime;
    }

    public String getFinalTime() {
        return finalTime;
    }
}
