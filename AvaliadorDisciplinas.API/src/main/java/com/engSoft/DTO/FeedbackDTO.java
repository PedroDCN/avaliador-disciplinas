package com.engSoft.DTO;


import com.engSoft.util.Util;

public class FeedbackDTO {
    private Long idCourse;
    private Long idStudent;
    private Integer workload;
    private Integer methodology;
    private Integer planning;
    private Integer evaluationSystem;
    private Integer courseware;
    private Util.ModalityEnum modality;

    public Long getIdCourse() {
        return idCourse;
    }

    public Long getIdStudent() {
        return idStudent;
    }

    public Integer getWorkload() {
        return workload;
    }

    public Integer getMethodology() {
        return methodology;
    }

    public Integer getPlanning() {
        return planning;
    }

    public Integer getEvaluationSystem() {
        return evaluationSystem;
    }

    public Integer getCourseware() {
        return courseware;
    }

    public Util.ModalityEnum getModality() {
        return modality;
    }
}
