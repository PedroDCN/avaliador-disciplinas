package com.engSoft.entities;

public class AvarageFeedback {
    private double avarageWorkload;
    private double avarageDidactic;
    private double avarageOrganization;
    private double avarageEvaluationSystem;
    private double avarageCourseware;
    private double avarageTotal;

    public double getAvarageWorkload() {
        return avarageWorkload;
    }

    public void setAvarageWorkload(double avarageWorkload) {
        this.avarageWorkload = avarageWorkload;
    }

    public double getAvarageDidactic() {
        return avarageDidactic;
    }

    public void setAvarageDidactic(double avarageDidactic) {
        this.avarageDidactic = avarageDidactic;
    }

    public double getAvarageOrganization() {
        return avarageOrganization;
    }

    public void setAvarageOrganization(double avarageOrganization) {
        this.avarageOrganization = avarageOrganization;
    }

    public double getAvarageEvaluationSystem() {
        return avarageEvaluationSystem;
    }

    public void setAvarageEvaluationSystem(double avarageEvaluationSystem) {
        this.avarageEvaluationSystem = avarageEvaluationSystem;
    }

    public double getAvarageCourseware() {
        return avarageCourseware;
    }

    public void setAvarageCourseware(double avarageCourseware) {
        this.avarageCourseware = avarageCourseware;
    }

    public double getAvarageTotal() {
        return (getAvarageCourseware() + getAvarageDidactic() + getAvarageWorkload() + getAvarageOrganization() + getAvarageEvaluationSystem()) / 5;
    }

}
