package com.engSoft.repositories;

import com.engSoft.entities.Comment;
import com.engSoft.entities.Course;
import com.engSoft.entities.Semester;
import com.engSoft.entities.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;

public interface CommentRepository extends PagingAndSortingRepository<Comment, Long> {
    Page<Comment> findAllByCourse(Course course, Pageable pageable);
    Page<Comment> findAllByStudent(User student, Pageable pageable);
    Page<Comment> findAllBySemesterAndCourse(Semester semester, Course course, Pageable pageable);
    List<Comment> findAllByCourse(Course course);
    List<Comment> findAllByStudent(User student);
    List<Comment> findAllBySemesterAndCourse(Semester semester, Course course);
    List<Comment> findAllByComplaintsGreaterThan(int i);
}
