package com.engSoft.services;

import com.engSoft.entities.Comment;
import com.engSoft.entities.Course;
import com.engSoft.entities.Semester;
import com.engSoft.entities.User;
import org.springframework.data.domain.Page;

import java.util.List;
import java.util.Optional;

public interface CommentService {
    void saveComment(Comment comment);
    List<Comment> listComments();
    Page<Comment> pageCommentByCourse(Course course, Integer page);
    Page<Comment> pageCommentByStudent(User student, Integer page);
    Page<Comment> pageCommentBySemesterAndCourse(Semester semester, Course course, Integer page);
    List<Comment> listCommentBySemesterAndCourse(Semester semester, Course course);
    List<Comment> listCommentByCourse(Course course);
    List<Comment> listCommentByStudent(User student);
    void removeComment(Long id);
    Optional<Comment> findCommentById(Long id);
    void updateDeletedComments(User user);
    List<Comment> listCommentWithComplaints();
}
