package com.engSoft.repositories;

import com.engSoft.entities.Course;
import com.engSoft.entities.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CourseRepository extends JpaRepository<Course, Long> {
    List<Course> findAllByTeacher(Teacher teacher);
}
