package com.engSoft.repositories;

import com.engSoft.entities.Course;
import com.engSoft.entities.Feedback;
import com.engSoft.entities.Semester;
import com.engSoft.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface FeedbackRepository extends JpaRepository<Feedback, Long> {
    List<Feedback> findAllByCourse(Course course);
    List<Feedback> findAllBySemester(Semester semester);
    List<Feedback> findAllByCourseAndSemester(Course course, Semester semester);
    List<Feedback> findAllByStudent(User student);

    List<Feedback> findAllByStudentAndCourseAndSemester(User student, Course course, Semester semester);
}

