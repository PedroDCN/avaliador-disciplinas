package com.engSoft.services;

import com.engSoft.entities.Comment;
import com.engSoft.entities.Course;
import com.engSoft.entities.Semester;
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
    public Page<Comment> pageCommentByCourse(Course course, Integer page){
        Pageable paging = PageRequest.of(page, 5, Sort.by("up").descending());
        return this.commentRepository.findAllByCourse(course, paging);
    }
    @Override
    public Page<Comment> pageCommentByStudent(User student, Integer page){
        Pageable paging = PageRequest.of(page, 5, Sort.by("up").descending());
        return this.commentRepository.findAllByStudent(student, paging);
    }

    @Override
    public Page<Comment> pageCommentBySemesterAndCourse(Semester semester, Course course, Integer page) {
        Pageable paging = PageRequest.of(page, 5, Sort.by("up").descending());
        return this.commentRepository.findAllBySemesterAndCourse(semester, course, paging);
    }

    @Override
    public List<Comment> listCommentBySemesterAndCourse(Semester semester, Course course) {
        return this.commentRepository.findAllBySemesterAndCourse(semester, course);
    }

    @Override
    public List<Comment> listCommentByCourse(Course course){
        return this.commentRepository.findAllByCourse(course);
    }
    @Override
    public List<Comment> listCommentByStudent(User student){
        return this.commentRepository.findAllByStudent(student);
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

    @Override
    public List<Comment> listCommentWithComplaints() {
        return commentRepository.findAllByComplaintsGreaterThan(0);
    }
}
