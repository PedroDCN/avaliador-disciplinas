package com.engSoft.DTO;

public class CommentDTO {
    private Long idCourse;
    private Long idStudent;
    private Long idSemester;
    private String description;

    public Long getIdCourse() {
        return idCourse;
    }

    public Long getIdStudent() {
        return idStudent;
    }

    public Long getIdSemester() { return idSemester; }

    public String getDescription() {
        return description;
    }
}
