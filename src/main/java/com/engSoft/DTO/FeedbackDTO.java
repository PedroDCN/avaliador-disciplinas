package com.engSoft.DTO;

import com.engSoft.entities.types.ModalityEnum;

public class FeedbackDTO {
    private Long idCourse;
    private Long idStudent;
    private Integer workload;
    private Integer methodology;
    private Integer planning;
    private Integer evaluationSystem;
    private Integer courseware;
    private ModalityEnum modality;

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

    public ModalityEnum getModality() {
        return modality;
    }
}
