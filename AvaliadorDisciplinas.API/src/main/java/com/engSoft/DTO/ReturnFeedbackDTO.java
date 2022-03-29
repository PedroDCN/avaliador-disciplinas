package com.engSoft.DTO;

import com.engSoft.entities.Feedback;
import com.engSoft.util.Util;

public class ReturnFeedbackDTO {

    private final Long id;
    private final Long idCourse;
    private final String nomeCourse;
    private final Long idStudent;
    private final Long idSemester;
    private final String nomeSemester;
    private final double workload;
    private final double didactic;
    private final double organization;
    private final double evaluationSystem;
    private final double courseware;
    private final Util.ModalityEnum modality;

    public ReturnFeedbackDTO(Feedback feedback) {
        this.id = id;
        this.idCourse = idCourse;
        this.nomeCourse = nomeCourse;
        this.idStudent = idStudent;
        this.idSemester = idSemester;
        this.nomeSemester = nomeSemester;
        this.workload = workload;
        this.didactic = didactic;
        this.organization = organization;
        this.evaluationSystem = evaluationSystem;
        this.courseware = courseware;
        this.modality = modality;
    }
}
