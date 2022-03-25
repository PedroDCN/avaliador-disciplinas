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
        return (List<Comment>) this.commentRepository.findAll();
    }

    @Override
    public Page<Comment> listCommentByCourse(Long idCourse, Integer page){
        Pageable paging = PageRequest.of(page, 5, Sort.by("up").descending());
        return this.commentRepository.findAllByIdCourse(idCourse, paging);
    }
    @Override
    public Page<Comment> listCommentByStudent(Long idCourse, Integer page){
        Pageable paging = PageRequest.of(page, 5, Sort.by("up").descending());
        return this.commentRepository.findAllByIdStudent(idCourse, paging);
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
        Pageable paging = PageRequest.of(page, 5, Sort.by("up").descending());
        return this.commentRepository.findAllByIdSemesterAndIdCourse(idSemester, idCourse, paging);
    }

    @Override
    public void updateDeletedComments(User user) {
        user.setDeletedComments(user.getDeletedComments()+1);

    }
}
