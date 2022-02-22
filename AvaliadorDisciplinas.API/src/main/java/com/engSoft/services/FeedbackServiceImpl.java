package com.engSoft.services;

import com.engSoft.entities.Feedback;
import com.engSoft.repositories.FeedbackRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FeedbackServiceImpl implements FeedbackService {

    @Autowired
    private FeedbackRepository feedbackRepository;

    @Override
    public void saveFeedback(Feedback feedback) {
        this.feedbackRepository.save(feedback);
    }

    @Override
    public List<Feedback> listFeedbacks() {
        return this.feedbackRepository.findAll();
    }

    @Override
    public List<Feedback> listFeedbackByCourse(Long idCourse) {
        return this.feedbackRepository.findAllByIdCourse(idCourse);
    }

    @Override
    public void removeFeedback(Long idFeedback) {
        this.feedbackRepository.deleteById(idFeedback);
    }

    @Override
    public Optional<Feedback> findFeedbackById(Long id) {
        return this.feedbackRepository.findById(id);
    }
}
