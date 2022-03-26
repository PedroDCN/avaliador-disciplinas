package com.engSoft.services;

import com.engSoft.entities.Comment;
import com.engSoft.entities.User;
import org.springframework.data.domain.Page;

import java.util.List;
import java.util.Optional;

public interface CommentService {
    void saveComment(Comment comment);
    List<Comment> listComments();
    Page<Comment> pageCommentByCourse(Long idCourse, Integer page);
    Page<Comment> pageCommentByStudent(Long idStudent, Integer page);
    Page<Comment> pageCommentBySemesterAndCourse(Long idSemester, Long idCourse, Integer page);
    List<Comment> listCommentByCourse(Long idCourse);
    List<Comment> listCommentByStudent(Long idStudent);
    List<Comment> listCommentBySemesterAndCourse(Long idSemester, Long idCourse);
    void removeComment(Long id);
    Optional<Comment> findCommentById(Long id);
    void updateDeletedComments(User user);
    List<Comment> listCommentWithComplaints();
}
