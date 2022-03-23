package com.engSoft.repositories;

import com.engSoft.entities.Comment;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CommentRepository extends JpaRepository<Comment, Long> {
    List<Comment> findAllByIdCourse(Long id);
    Page<Comment> findAllByIdSemesterAndIdCourse(Long idSemester, Long idCourse, Pageable pageable);
}
