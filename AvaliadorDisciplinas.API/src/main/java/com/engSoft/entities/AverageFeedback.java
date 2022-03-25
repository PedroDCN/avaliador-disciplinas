package com.engSoft.entities;

public class AverageFeedback {
    private double averageWorkload;
    private double averageDidactic;
    private double averageOrganization;
    private double averageEvaluationSystem;
    private double averageCourseware;


    public double getAverageWorkload() {
        return averageWorkload;
    }

    public void setAverageWorkload(double averageWorkload) {
        this.averageWorkload = averageWorkload;
    }

    public double getAverageDidactic() {
        return averageDidactic;
    }

    public void setAverageDidactic(double averageDidactic) {
        this.averageDidactic = averageDidactic;
    }

    public double getAverageOrganization() {
        return averageOrganization;
    }

    public void setAverageOrganization(double averageOrganization) {
        this.averageOrganization = averageOrganization;
    }

    public double getAverageEvaluationSystem() {
        return averageEvaluationSystem;
    }

    public void setAverageEvaluationSystem(double averageEvaluationSystem) {
        this.averageEvaluationSystem = averageEvaluationSystem;
    }

    public double getAverageCourseware() {
        return averageCourseware;
    }

    public void setAverageCourseware(double averageCourseware) {
        this.averageCourseware = averageCourseware;
    }

    public double getAverageTotal() {
        return (getAverageCourseware() + getAverageDidactic() + getAverageWorkload() + getAverageOrganization() + getAverageEvaluationSystem()) / 5;
    }

}
