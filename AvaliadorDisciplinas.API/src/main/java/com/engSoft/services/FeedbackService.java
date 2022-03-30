package com.engSoft.services;

import com.engSoft.entities.*;

import java.util.List;
import java.util.Optional;

public interface FeedbackService {
    void saveFeedback(Feedback feedback);
    List<Feedback> listFeedbacks();

    List<Feedback> listFeedbackByCourse(Course course);

    AverageFeedback averageFeedbackByCourse(Course course);

    void removeFeedback(Long idFeedback);
    Optional<Feedback> findFeedbackById(Long id);

    List<Feedback> findFeedbackBySemester(Semester semester);

    List<Feedback> findFeedbackByCourseAndSemester(Course course, Semester semester);

    AverageFeedback averageFeedbackByCourseAndSemester(Course course, Semester semester);

    List<Feedback> findFeedbackByStudent(User student);

    List<Feedback> findFeedbackByStudentCourseAndSemester(User student, Course course, Semester semester);
}
