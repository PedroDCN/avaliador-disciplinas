package com.engSoft.entities;

import com.engSoft.DTO.CommentDTO;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.*;

@Entity
public class Comment {
    @Id
    @GeneratedValue
    private Long id;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "course_id")
    @OnDelete(action = OnDeleteAction.CASCADE)
    private Course course;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "student_id")
    @OnDelete(action = OnDeleteAction.CASCADE)
    private User student;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "semester_id")
    @OnDelete(action = OnDeleteAction.CASCADE)
    private Semester semester;

    private String description;
    private Integer up;
    private Integer down;
    private Integer complaints;

    public Comment(Course course, User student, Semester semester, String description) {
        this.course = course;
        this.student = student;
        this.semester = semester;
        this.description = description;
        this.up = 0;
        this.down = 0;
        this.complaints = 0;
    }

    public Comment() {

    }

    public Long getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getUp() {
        return up;
    }

    public void setUp(Integer up) {
        this.up = up;
    }

    public Integer getDown() {
        return down;
    }

    public void setDown(Integer down) {
        this.down = down;
    }

    public Integer getComplaints() {
        return complaints;
    }

    public void setComplaints(Integer complaints) {
        this.complaints = complaints;
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
