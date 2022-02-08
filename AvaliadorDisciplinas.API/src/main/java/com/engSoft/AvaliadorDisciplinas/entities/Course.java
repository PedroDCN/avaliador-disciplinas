package com.engSoft.AvaliadorDisciplinas.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Course {
    @Id
    @GeneratedValue
    private Long id;

    private String name;

    private String code;

    @ManyToOne
    private Long idTeacher;

    private String initialTime;

    private String finalTime;

    public Course(){

    }

    public Course(String name, String code, Long idTeacher, String initialTime, String finalTime){
        this.name = name;
        this.code = code;
        this.idTeacher = idTeacher;
        this.initialTime = initialTime;
        this.finalTime = finalTime;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Long getIdTeacher() {
        return idTeacher;
    }

    public void setIdTeacher(Long idTeacher) {
        this.idTeacher = idTeacher;
    }

    public String getInitialTime() {
        return initialTime;
    }

    public void setInitialTime(String initialTime) {
        this.initialTime = initialTime;
    }

    public String getFinalTime() {
        return finalTime;
    }

    public void setFinalTime(String finalTime) {
        this.finalTime = finalTime;
    }

    @Override
    public String toString() {
        return "Course{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", code='" + code + '\'' +
                ", idTeacher=" + idTeacher +
                ", initialTime='" + initialTime + '\'' +
                ", finalTime='" + finalTime + '\'' +
                '}';
    }
}
