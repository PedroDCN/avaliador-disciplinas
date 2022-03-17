package com.engSoft.services;

import com.engSoft.entities.Course;
import com.engSoft.entities.Feedback;
import com.engSoft.repositories.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class CourseServiceImpl implements CourseService {

    @Autowired
    private CourseRepository courseRepository;

    @Override
    public void saveCourse(Course course) {
        courseRepository.save(course);
    }

    @Override
    public List<String> listCourses() {
        return toSimpleString(courseRepository.findAll());
    }

    @Override
    public List<String> listCoursesSortName() {
        return toSimpleString(courseRepository.findAll(Sort.by("name")));
    }

    @Override
    public List<String> listCoursesSortSemester() {
        return toSimpleString(courseRepository.findAll(Sort.by("semester")));
    }

    @Override
    public List<String> listCoursesSortGrade() {
        return toSimpleString(courseRepository.findAll(Sort.by("grade")));
    }

    private List<String> toSimpleString(List<Course> list) {
        List<String> stringList = new ArrayList<>();
        for(Course course : list) {
            stringList.add(course.toSimpleString());
        }
        return stringList;
    }

    @Override
    public List<Course> listCoursesTeacher(Long idTeacher) {
        return courseRepository.findAllByIdTeacher(idTeacher);
    }

    @Override
    public void removeCourse(Course course) {
        courseRepository.delete(course);
    }

    @Override
    public void updateGrade(Course course, Feedback feedback) {
        course.updateGrade(feedback);
        saveCourse(course);
    }

    @Override
    public Optional<Course> findCourseById(Long id) {
        return courseRepository.findById(id);
    }

}
