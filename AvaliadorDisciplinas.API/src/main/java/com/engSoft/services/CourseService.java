package com.engSoft.services;

import com.engSoft.DTO.SimpleCourseDTO;
import com.engSoft.entities.Course;
import com.engSoft.entities.Feedback;
import com.engSoft.util.Util;

import java.util.List;
import java.util.Optional;

public interface CourseService {
    void saveCourse(Course course);
    List<SimpleCourseDTO> listCourses();
    List<SimpleCourseDTO> listCoursesFilter(Util.FilterEnum filter);
    List<Course> listCoursesTeacher(Long idTeacher);
    void removeCourse(Course course);
    void updateGrade(Course course, List<Feedback> feedback);
    Optional<Course> findCourseById(Long id);
}
