package com.engSoft.services;

import com.engSoft.entities.Feedback;

import java.util.List;
import java.util.Optional;

public interface FeedbackService {
    public void saveFeedback(Feedback feedback);
    public List<Feedback> listFeedbacks();
    public List<Feedback> listFeedbackByCourse(Long idCourse);
    public void removeFeedback(Long idFeedback);
    public Optional<Feedback> findFeedbackById(Long id);
}
