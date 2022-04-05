package com.engSoft.entities;

import com.engSoft.DTO.FeedbackDTO;
import com.engSoft.util.Util;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.*;

@Entity
public class Feedback {
    @Id
    @GeneratedValue
    private Long id;

    @ManyToOne()
    @JoinColumn(name = "course_id")
    @OnDelete(action = OnDeleteAction.CASCADE)
    private Course course;

    @ManyToOne()
    @JoinColumn(name = "student_id")
    @OnDelete(action = OnDeleteAction.CASCADE)
    private User student;

    @ManyToOne()
    @JoinColumn(name = "semester_id")
    @OnDelete(action = OnDeleteAction.CASCADE)
    private Semester semester;

    private double workload;
    private double didactic;
    private double organization;
    private double evaluationSystem;
    private double courseware;
    private Util.ModalityEnum modality;

    public Feedback(FeedbackDTO feedbackDTO, Course course, User student, Semester semester) {
        this.course = course;
        this.student = student;
        this.workload = feedbackDTO.getWorkload();
        this.didactic = feedbackDTO.getDidactic();
        this.organization = feedbackDTO.getOrganization();
        this.evaluationSystem = feedbackDTO.getEvaluationSystem();
        this.courseware = feedbackDTO.getCourseware();
        this.modality = feedbackDTO.getModality();
        this.semester = semester;
    }

    public Feedback() {

    }

    public Long getId() {
        return id;
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

    public void setId(Long id) {
        this.id = id;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public User getStudent() {
        return student;
    }

    public void setStudent(User student) {
        this.student = student;
    }

    public Semester getSemester() {
        return semester;
    }

    public void setSemester(Semester semester) {
        this.semester = semester;
    }
}
