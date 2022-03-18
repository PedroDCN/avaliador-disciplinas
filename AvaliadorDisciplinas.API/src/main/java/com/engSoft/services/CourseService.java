package com.engSoft.services;

import com.engSoft.DTO.SimpleCourseDTO;
import com.engSoft.entities.Course;
import com.engSoft.entities.Feedback;
import com.engSoft.entities.Teacher;
import com.engSoft.util.Util;

import java.util.List;
import java.util.Optional;

public interface CourseService {
    public void saveCourse(Course course);
    public List<SimpleCourseDTO> listCourses();
    public List<SimpleCourseDTO> listCoursesFilter(Util.FilterEnum filter);
    public List<Course> listCoursesTeacher(Teacher teacher);
    public void removeCourse(Course course);
    public void updateGrade(Course course, List<Feedback> feedback);
    public Optional<Course> findCourseById(Long id);
}
