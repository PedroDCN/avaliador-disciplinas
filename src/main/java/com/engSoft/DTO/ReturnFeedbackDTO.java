package com.engSoft.DTO;

import com.engSoft.entities.Feedback;
import com.engSoft.util.Util;

public class ReturnFeedbackDTO {

    private final Long id;
    private final Long idCourse;
    private final String nomeCourse;
    private final Long idStudent;
    private final Long idSemester;
    private final String nomeSemester;
    private final double workload;
    private final double didactic;
    private final double organization;
    private final double evaluationSystem;
    private final double courseware;
    private final Util.ModalityEnum modality;

    public ReturnFeedbackDTO(Feedback feedback) {
        this.id = feedback.getId();
        this.idCourse = feedback.getCourse().getId();
        this.nomeCourse = feedback.getCourse().getName();
        this.idStudent = feedback.getStudent().getId();
        this.idSemester = feedback.getSemester().getId();
        this.nomeSemester = feedback.getSemester().getName();
        this.workload = feedback.getWorkload();
        this.didactic = feedback.getDidactic();
        this.organization = feedback.getOrganization();
        this.evaluationSystem = feedback.getEvaluationSystem();
        this.courseware = feedback.getCourseware();
        this.modality = feedback.getModality();
    }

    public Long getId() {
        return id;
    }

    public Long getIdCourse() {
        return idCourse;
    }

    public String getNomeCourse() {
        return nomeCourse;
    }

    public Long getIdStudent() {
        return idStudent;
    }

    public Long getIdSemester() {
        return idSemester;
    }

    public String getNomeSemester() {
        return nomeSemester;
    }

    public double getWorkload() {
        return workload;
    }

    public double getDidactic() {
        return didactic;
    }

    public double getOrganization() {
        return organization;
    }

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
