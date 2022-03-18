package com.engSoft.entities;

import com.engSoft.DTO.CourseDTO;

import javax.persistence.*;
import java.util.List;

@Entity
public class Course {

    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String code;
    @ManyToOne
    private Teacher teacher;
    private int grade;

    public Course() {}

    public Course(CourseDTO courseDTO, Teacher teacher) {
        this.name = courseDTO.getName();
        this.code = courseDTO.getCode();
        this.teacher = teacher;
        grade = 0;
    }

    public void update(CourseDTO courseDTO, Teacher teacher) {
        this.name = courseDTO.getName();
        this.code = courseDTO.getCode();
        this.teacher = teacher;
    }

    public void updateGrade(List<Feedback> feedbacks) {
        int soma = 0;
        int count = 0;
        for(Feedback feedback : feedbacks) {
            soma += feedback.getCourseware() + feedback.getMethodology() + feedback.getPlanning() + feedback.getWorkload() + feedback.getEvaluationSystem();
            count++;
        }
        grade = (soma/5)/count;
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

    public Teacher getTeacher() {
        return teacher;
    }

    public int getGrade() { return grade; }

    @Override
    public String toString() {
        return "Course{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", code='" + code + '\'' +
                ", teacher=" + teacher +
                ", grade=" + grade +
                '}';
    }
}
