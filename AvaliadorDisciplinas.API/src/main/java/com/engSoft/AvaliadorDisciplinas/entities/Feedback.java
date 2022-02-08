package com.engSoft.AvaliadorDisciplinas.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Feedback {
    @Id
    @GeneratedValue
    private Long id;
    @ManyToOne
    private Long idCourse;
    @ManyToOne
    private Long idStudent;

    private Integer workload;

    private Integer methodology;

    private Integer planning;

    private Integer evaluationSystem;

    private Integer courseware;

    private Enum modality;

    public Feedback() {
    }

    public Feedback(Long idCourse, Long idStudent, Integer workload, Integer methodology, Integer planning, Integer evaluationSystem, Integer courseware, Enum modality) {
        this.idCourse = idCourse;
        this.idStudent = idStudent;
        this.workload = workload;
        this.methodology = methodology;
        this.planning = planning;
        this.evaluationSystem = evaluationSystem;
        this.courseware = courseware;
        this.modality = modality;
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

    public Long getIdStudent() {
        return idStudent;
    }

    public void setIdStudent(Long idStudent) {
        this.idStudent = idStudent;
    }

    public Integer getWorkload() {
        return workload;
    }

    public void setWorkload(Integer workload) {
        this.workload = workload;
    }

    public Integer getMethodology() {
        return methodology;
    }

    public void setMethodology(Integer methodology) {
        this.methodology = methodology;
    }

    public Integer getPlanning() {
        return planning;
    }

    public void setPlanning(Integer planning) {
        this.planning = planning;
    }

    public Integer getEvaluationSystem() {
        return evaluationSystem;
    }

    public void setEvaluationSystem(Integer evaluationSystem) {
        this.evaluationSystem = evaluationSystem;
    }

    public Integer getCourseware() {
        return courseware;
    }

    public void setCourseware(Integer courseware) {
        this.courseware = courseware;
    }

    public Enum getModality() {
        return modality;
    }

    public void setModality(Enum modality) {
        this.modality = modality;
    }

    @Override
    public String toString() {
        return "Feedback{" +
                "id=" + id +
                ", idCourse=" + idCourse +
                ", idStudent=" + idStudent +
                ", workload=" + workload +
                ", methodology=" + methodology +
                ", planning=" + planning +
                ", evaluationSystem=" + evaluationSystem +
                ", courseware=" + courseware +
                ", modality=" + modality +
                '}';
    }
}
