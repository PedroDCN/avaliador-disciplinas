package com.engSoft.services;

import com.engSoft.entities.Comment;
import com.engSoft.entities.User;
import com.engSoft.repositories.CommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CommentServiceImpl implements CommentService{
    @Autowired
    private CommentRepository commentRepository;

    @Override
    public void saveComment(Comment comment) {
        this.commentRepository.save(comment);
    }

    @Override
    public List<Comment> listComments() {
        return this.commentRepository.findAll();
    }

    @Override
    public List<Comment> listCommentByCourse(Long idCourse){
        return this.commentRepository.findAllByIdCourse(idCourse);
    }

    @Override
    public void removeComment(Long id) {
        this.commentRepository.deleteById(id);
    }

    @Override
    public Optional<Comment> findCommentById(Long id) {
        return this.commentRepository.findById(id);
    }

    @Override
    public void updateDeletedComments(User user) {
        user.setDeletedComments(user.getDeletedComments()+1);

    }
}
