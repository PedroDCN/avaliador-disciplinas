package com.engSoft.repositories;

import com.engSoft.entities.Course;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CourseRepository extends JpaRepository<Course, Long> {
    List<Course> findAllByIdTeacher(Long id);
}
