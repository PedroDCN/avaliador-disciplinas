package com.engSoft.services;

import com.engSoft.entities.Comment;
import java.util.List;
import java.util.Optional;

public interface CommentService {
    public void saveComment(Comment comment);
    public List<Comment> listComments();
    public List<Comment> listCommentByCourse(Long idCourse);
    public void removeComment(Long id);
    public Optional<Comment> findCommentById(Long id);
    public List<Comment> listCommentBySemester(Long idSemester);

}
