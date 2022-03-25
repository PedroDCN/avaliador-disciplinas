package com.engSoft.services;

import com.engSoft.entities.Comment;
import com.engSoft.entities.User;
import org.springframework.data.domain.Page;

import java.util.List;
import java.util.Optional;

public interface CommentService {
    void saveComment(Comment comment);
    List<Comment> listComments();
    Page<Comment> listCommentByCourse(Long idCourse, Integer page);
    Page<Comment> listCommentByStudent(Long idStudent, Integer page);
    void removeComment(Long id);
    Optional<Comment> findCommentById(Long id);
    Page<Comment> listCommentBySemesterAndCourse(Long idSemester, Long idCourse, Integer page);
    void updateDeletedComments(User user);
}
