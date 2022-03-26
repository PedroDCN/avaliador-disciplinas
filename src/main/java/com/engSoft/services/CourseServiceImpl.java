package com.engSoft.services;

import com.engSoft.DTO.SimpleCourseDTO;
import com.engSoft.entities.Course;
import com.engSoft.entities.Feedback;
import com.engSoft.repositories.CourseRepository;
import com.engSoft.util.Util;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
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
    public List<SimpleCourseDTO> listCourses() {
        return toSimpleCourse(courseRepository.findAll());
    }

    @Override
    public List<SimpleCourseDTO> listCoursesFilter(Util.FilterEnum filter) {
        if(filter == Util.FilterEnum.NAME) {
            return toSimpleCourse(courseRepository.findAll(Sort.by("name")));
        } else if(filter == Util.FilterEnum.GRADE) {
            List<SimpleCourseDTO> list = toSimpleCourse(courseRepository.findAll(Sort.by("grade")));
            Collections.reverse(list);
            return list;
        } else {
            return toSimpleCourse(courseRepository.findAll(Sort.by("idTeacher")));
        }
    }

    private List<SimpleCourseDTO> toSimpleCourse(List<Course> list) {
        List<SimpleCourseDTO> simpleList = new ArrayList<>();
        for(Course course : list) {
            simpleList.add(new SimpleCourseDTO(course.getId(), course.getName(), course.getIdTeacher(), course.getGrade()));
        }
        return simpleList;
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
    public void updateGrade(Course course, List<Feedback> feedback) {
        course.updateGrade(feedback);
        saveCourse(course);
    }

    @Override
    public Optional<Course> findCourseById(Long id) {
        return courseRepository.findById(id);
    }

}
