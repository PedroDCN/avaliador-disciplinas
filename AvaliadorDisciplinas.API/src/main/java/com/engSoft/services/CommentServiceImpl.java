package com.engSoft.services;

import com.engSoft.entities.Comment;
import com.engSoft.entities.User;
import com.engSoft.repositories.CommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.awt.print.PageFormat;
import java.awt.print.Printable;
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
    public Iterable<Comment> listComments() {
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
    public Page<Comment> listCommentBySemesterAndCourse(Long idSemester, Long idCourse, Integer page) {
        Pageable paging = PageRequest.of(page, 5);
        return this.commentRepository.findAllByIdSemesterAndIdCourse(idSemester, idCourse, paging);
    }

    @Override
    public void updateDeletedComments(User user) {
        user.setDeletedComments(user.getDeletedComments()+1);

    }
}
