package com.engSoft.repositories;

import com.engSoft.entities.Comment;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;

public interface CommentRepository extends PagingAndSortingRepository<Comment, Long> {
    Page<Comment> findAllByIdCourse(Long id, Pageable pageable);
    Page<Comment> findAllByIdStudent(Long idStudent, Pageable pageable);
    Page<Comment> findAllByIdSemesterAndIdCourse(Long idSemester, Long idCourse, Pageable pageable);
}
