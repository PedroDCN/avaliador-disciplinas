package com.engSoft.DTO;


import com.engSoft.util.Util;

public class FeedbackDTO {
    private Long idCourse;
    private Long idStudent;
    private Long idSemester;
    private double workload;
    private double didactic;
    private double organization;
    private double evaluationSystem;
    private double courseware;
    private Util.ModalityEnum modality;

    public Long getIdCourse() {
        return idCourse;
    }

    public Long getIdStudent() {
        return idStudent;
    }

    public Long getIdSemester() { return idSemester; }

    public double getWorkload() {
        return workload;
    }

    public double getDidactic() { return didactic; }

    public double getOrganization() { return organization; }

    public double getEvaluationSystem() {
        return evaluationSystem;
    }

    public double getCourseware() {
        return courseware;
    }

    public Util.ModalityEnum getModality() {
        return modality;
    }
}
