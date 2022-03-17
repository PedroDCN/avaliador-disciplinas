package com.engSoft.entities;

import com.engSoft.DTO.FeedbackDTO;
import com.engSoft.entities.types.ModalityEnum;
import org.hibernate.type.descriptor.sql.SmallIntTypeDescriptor;

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
    private Integer workload;
    private Integer methodology;
    private Integer planning;
    private Integer evaluationSystem;
    private Integer courseware;
    private ModalityEnum modality;

    public Feedback(FeedbackDTO feedbackDTO) {
        this.idCourse = feedbackDTO.getIdCourse();
        this.idStudent = feedbackDTO.getIdStudent();
        this.workload = feedbackDTO.getWorkload();
        this.methodology = feedbackDTO.getMethodology();
        this.planning = feedbackDTO.getPlanning();
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

    public ModalityEnum getModality() {
        return modality;
    }

    public void setModality(ModalityEnum modality) {
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
