package com.engSoft.repositories;

import com.engSoft.entities.Comment;
import com.engSoft.entities.Feedback;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CommentRepository extends JpaRepository<Comment, Long> {
    List<Comment> findAllByIdCourse(Long id);
    List<Comment> findAllByIdSemester(Long idSemester);
}
