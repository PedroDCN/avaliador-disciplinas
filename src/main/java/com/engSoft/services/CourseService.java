package com.engSoft.services;

import com.engSoft.entities.Course;

import java.util.List;
import java.util.Optional;

public interface CourseService {
    public void saveCourse(Course course);
    public List<Course> listCourses();
    public List<Course> listCoursesTeacher(Long idTeacher);
    public void removeCourse(Course course);
    public Optional<Course> findCourseById(Long id);
}
