package com.engSoft.services;

import com.engSoft.entities.Course;
import com.engSoft.entities.Feedback;

import java.util.List;
import java.util.Optional;

public interface CourseService {
    public void saveCourse(Course course);
    public List<String> listCourses();
    public List<String> listCoursesSortName();
    public List<String> listCoursesSortSemester();
    public List<String> listCoursesSortGrade();
    public List<Course> listCoursesTeacher(Long idTeacher);
    public void removeCourse(Course course);
    public void updateGrade(Course course, Feedback feedback);
    public Optional<Course> findCourseById(Long id);
}
