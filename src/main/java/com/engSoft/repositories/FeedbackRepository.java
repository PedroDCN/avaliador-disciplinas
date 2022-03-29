package com.engSoft.repositories;

import com.engSoft.entities.Feedback;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface FeedbackRepository extends JpaRepository<Feedback, Long> {
    List<Feedback> findAllByIdCourse(Long idCourse);
    List<Feedback> findAllByIdSemester(Long idSemester);
    List<Feedback> findAllByIdCourseAndIdSemester(Long idCourse, Long idSemester);
    List<Feedback> findAllByIdStudent(Long idStudent);
    List<Feedback> findAllByIdStudentAndIdCourseAndIdSemester(Long idStudent, Long idCourse, Long idSemester);
}

