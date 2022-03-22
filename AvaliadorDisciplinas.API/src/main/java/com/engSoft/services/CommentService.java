package com.engSoft.services;

import com.engSoft.entities.Comment;
import com.engSoft.entities.User;
import org.springframework.data.domain.Page;

import java.util.List;
import java.util.Optional;

public interface CommentService {
    public void saveComment(Comment comment);
    public Iterable<Comment> listComments();
    public List<Comment> listCommentByCourse(Long idCourse);
    public void removeComment(Long id);
    public Optional<Comment> findCommentById(Long id);
    public Page<Comment> listCommentBySemesterAndCourse(Long idSemester, Long idCourse, Integer page);
    public void updateDeletedComments(User user);
}
