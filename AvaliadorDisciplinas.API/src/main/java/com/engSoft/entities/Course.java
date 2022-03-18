package com.engSoft.entities;

import com.engSoft.DTO.CourseDTO;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.List;

@Entity
public class Course {

    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String code;
    private Long idTeacher;
    private Integer courseware, evaluationSystem, methodology, planning, workload;
    private Integer grade;
    private Integer countFeedback;
    private String semester;

    public Course() {}

    public Course(CourseDTO courseDTO, Long idTeacher) {
        this.name = courseDTO.getName();
        this.code = courseDTO.getCode();
        this.idTeacher = idTeacher;
        courseware = 0;
        evaluationSystem = 0;
        methodology = 0;
        planning = 0;
        workload = 0;
        grade = 0;
        countFeedback = 0;
        this.semester = courseDTO.getSemester();
    }

    public void update(CourseDTO courseDTO, Long idTeacher) {
        this.name = courseDTO.getName();
        this.code = courseDTO.getCode();
        this.idTeacher = idTeacher;
        this.semester = courseDTO.getSemester();
    }

    public void updateGrade(Feedback feedback) {
        courseware = (courseware * countFeedback + feedback.getCourseware())/(countFeedback + 1);
        evaluationSystem = (evaluationSystem * countFeedback + feedback.getEvaluationSystem())/(countFeedback + 1);
        methodology = (methodology * countFeedback + feedback.getMethodology())/(countFeedback + 1);
        planning = (planning * countFeedback + feedback.getPlanning())/(countFeedback + 1);
        workload = (workload * countFeedback + feedback.getWorkload())/(countFeedback + 1);

        grade = (courseware + evaluationSystem + methodology + planning + workload) / 5;
        countFeedback++;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getCode() {
        return code;
    }

    public Long getIdTeacher() {
        return idTeacher;
    }

    public Integer getGrade() { return grade; }

    public String getSemester() { return semester;}

    public String toSimpleString() {
        return "Course{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", grade='" + grade + '\'' +
                '}';
    }

    @Override
    public String toString() {
        return "Course{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", code='" + code + '\'' +
                ", idTeacher=" + idTeacher +
                ", courseware=" + courseware +
                ", evaluationSystem=" + evaluationSystem +
                ", methodology=" + methodology +
                ", planning=" + planning +
                ", workload=" + workload +
                ", grade=" + grade +
                ", semester='" + semester + '\'' +
                '}';
    }
}
