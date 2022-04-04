package com.engSoft.services;

import com.engSoft.entities.Course;
import com.engSoft.entities.Feedback;
import com.engSoft.entities.Teacher;
import com.engSoft.repositories.CourseRepository;
import com.engSoft.util.Util;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.Collections;
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
    public List<Course> listCourses() {
        return courseRepository.findAll();
    }

    @Override
    public List<Course> listCoursesFilter(Util.FilterEnum filter) {
        if(filter == Util.FilterEnum.NAME) {
            return courseRepository.findAll(Sort.by("name"));
        } else if(filter == Util.FilterEnum.GRADE) {
            List<Course> list = courseRepository.findAll(Sort.by("grade"));
            Collections.reverse(list);
            return list;
        } else {
            return courseRepository.findAll(Sort.by("idTeacher"));
        }
    }

    @Override
    public List<Course> listCoursesTeacher(Teacher teacher) {
        return courseRepository.findAllByTeacher(teacher);
    }

    @Override
    public void removeCourse(Course course) {
        courseRepository.delete(course);
    }

    @Override
    public void updateGrade(Course course, List<Feedback> feedback) {
        course.updateGrade(feedback);
        saveCourse(course);
    }

    @Override
    public Optional<Course> findCourseById(Long id) {
        return courseRepository.findById(id);
    }
}
