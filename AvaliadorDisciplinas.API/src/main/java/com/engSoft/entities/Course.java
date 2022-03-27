package com.engSoft.entities;

import com.engSoft.DTO.CourseDTO;

import javax.persistence.*;
import java.util.List;

import static java.lang.Math.abs;

@Entity
public class Course {

    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String code;
    private Long idTeacher;
    private double grade;

    public Course() {}

    public Course(CourseDTO courseDTO, Long idTeacher) {
        this.name = courseDTO.getName();
        this.code = courseDTO.getCode();
        this.idTeacher = idTeacher;
        grade = 0;
    }

    public void updateGrade(List<Feedback> feedbacks) {
        int soma = 0;
        int count = 0;
        for(Feedback feedback : feedbacks) {
            soma += feedback.getCourseware() + feedback.getDidactic() + feedback.getOrganization() + abs(feedback.getWorkload()-10) + feedback.getEvaluationSystem();
            count++;
        }
        grade = (soma/5d)/count;
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

    public void setName(String name) {
        this.name = name;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setIdTeacher(Long idTeacher) {
        this.idTeacher = idTeacher;
    }

    public double getGrade() { return grade; }

    @Override
    public String toString() {
        return "Course{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", code='" + code + '\'' +
                ", teacher=" + idTeacher +
                ", grade=" + grade +
                '}';
    }
}
