package com.engSoft.entities;

import com.engSoft.DTO.CourseDTO;
import org.springframework.data.jpa.repository.Query;

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
    private Integer grade;
    private String semester;

    public Course() {}

    public Course(CourseDTO courseDTO, Long idTeacher) {
        this.name = courseDTO.getName();
        this.code = courseDTO.getCode();
        this.idTeacher = idTeacher;
        calculateGrade();
        this.semester = courseDTO.getSemester();
    }

    public void update(CourseDTO courseDTO, Long idTeacher) {
        this.name = courseDTO.getName();
        this.code = courseDTO.getCode();
        this.idTeacher = idTeacher;
        this.semester = courseDTO.getSemester();
    }

    @Query(value = "SELECT * from Feedback where idCourse == {idCourse}", nativeQuery = true)
    private List<Feedback> searchFeedbacks();

    public void calculateGrade() {
        List<Feedback> feedbackList = searchFeedbacks();
        int sum = 0;
        int count = 0;
        for(Feedback feedback : feedbackList) {
            sum += feedback.getCourseware() + feedback.getEvaluationSystem() + feedback.getMethodology() + feedback.getPlanning() + feedback.getWorkload();
            count += 1;
        }
        if(count == 0) {
            grade = 0;
        } else {
            grade = sum / count;
        }
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

    public String simpleToString() {
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
                ", idTeacher='" + idTeacher + '\''+
                ", grade='" + grade + '\'' +
                ", semester='" + semester + '\'' +
                '}';
    }
}
