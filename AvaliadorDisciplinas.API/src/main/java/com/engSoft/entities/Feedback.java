package com.engSoft.entities;

import com.engSoft.DTO.FeedbackDTO;
import com.engSoft.util.Util;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Feedback {
    @Id
    @GeneratedValue
    private Long id;
    private Long idCourse;
    private Long idStudent;
    private Long idSemester;
    private double workload;
    private double didactic;
    private double organization;
    private double evaluationSystem;
    private double courseware;
    private Util.ModalityEnum modality;

    public Feedback(FeedbackDTO feedbackDTO) {
        this.idCourse = feedbackDTO.getIdCourse();
        this.idStudent = feedbackDTO.getIdStudent();
        this.idSemester = feedbackDTO.getIdSemester();
        this.workload = feedbackDTO.getWorkload();
        this.didactic = feedbackDTO.getDidactic();
        this.organization = feedbackDTO.getOrganization();
        this.evaluationSystem = feedbackDTO.getEvaluationSystem();
        this.courseware = feedbackDTO.getCourseware();
        this.modality = feedbackDTO.getModality();
    }

    public Feedback() {

    }

    public Long getId() {
        return id;
    }

    public Long getIdCourse() {
        return idCourse;
    }

    public void setIdCourse(Long idCourse) {
        this.idCourse = idCourse;
    }

    public Long getIdSemester() {
        return idSemester;
    }

    public void setIdSemester(Long idSemester) {
        this.idSemester = idSemester;
    }

    public Long getIdStudent() {
        return idStudent;
    }

    public void setIdStudent(Long idStudent) {
        this.idStudent = idStudent;
    }

    public double getWorkload() {
        return workload;
    }

    public void setWorkload(double workload) {
        this.workload = workload;
    }

    public double getDidactic() {
        return didactic;
    }

    public void setDidactic(double didactic) {
        this.didactic = didactic;
    }

    public double getOrganization() {
        return organization;
    }

    public void setOrganization(double organization) {
        this.organization = organization;
    }

    public double getEvaluationSystem() {
        return evaluationSystem;
    }

    public void setEvaluationSystem(double evaluationSystem) {
        this.evaluationSystem = evaluationSystem;
    }

    public double getCourseware() {
        return courseware;
    }

    public void setCourseware(double courseware) {
        this.courseware = courseware;
    }

    public Util.ModalityEnum getModality() {
        return modality;
    }

    public void setModality(Util.ModalityEnum modality) {
        this.modality = modality;
    }

    @Override
    public String toString() {
        return "Feedback{" +
                "id=" + id +
                ", idCourse=" + idCourse +
                ", idStudent=" + idStudent +
                ", workload=" + workload +
                ", didactic=" + didactic +
                ", organization=" + organization +
                ", evaluationSystem=" + evaluationSystem +
                ", courseware=" + courseware +
                ", modality=" + modality +
                '}';
    }
}
