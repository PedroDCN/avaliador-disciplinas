package com.engSoft.DTO;


import com.engSoft.util.Util;

public class FeedbackDTO {
    private Long idCourse;
    private Long idStudent;
    private Long idSemester;
    private Integer workload;
    private Integer didactic;
    private Integer organization;
    private Integer evaluationSystem;
    private Integer courseware;
    private Util.ModalityEnum modality;

    public Long getIdCourse() {
        return idCourse;
    }

    public Long getIdStudent() {
        return idStudent;
    }

    public Long getIdSemester() { return idSemester; }

    public Integer getWorkload() {
        return workload;
    }

    public Integer getDidactic() { return didactic; }

    public Integer getOrganization() { return organization; }

    public Integer getEvaluationSystem() {
        return evaluationSystem;
    }

    public Integer getCourseware() {
        return courseware;
    }

    public Util.ModalityEnum getModality() {
        return modality;
    }
}
