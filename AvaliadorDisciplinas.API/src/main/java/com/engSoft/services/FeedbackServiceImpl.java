package com.engSoft.services;

import com.engSoft.entities.*;
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
    public List<Feedback> listFeedbackByCourse(Course course) {
        return this.feedbackRepository.findAllByCourse(course);
    }

    @Override
    public AverageFeedback averageFeedbackByCourse(Course course) {
        List<Feedback> feedbacks = this.feedbackRepository.findAllByCourse(course);

        return getAverageFeedbackFromList(feedbacks);
    }


    @Override
    public void removeFeedback(Long idFeedback) {
        this.feedbackRepository.deleteById(idFeedback);
    }

    @Override
    public Optional<Feedback> findFeedbackById(Long id) {
        return this.feedbackRepository.findById(id);
    }

    @Override
    public List<Feedback> findFeedbackBySemester(Semester semester) {
        return this.feedbackRepository.findAllBySemester(semester);
    }

    @Override
    public List<Feedback> findFeedbackByCourseAndSemester(Course course, Semester semester) {


        return this.feedbackRepository.findAllByCourseAndSemester(course, semester);
    }

    @Override
    public AverageFeedback averageFeedbackByCourseAndSemester(Course course, Semester semester) {
        List<Feedback> feedbacks = this.feedbackRepository.findAllByCourseAndSemester(course, semester);

        return getAverageFeedbackFromList(feedbacks);
    }

    @Override
    public List<Feedback> findFeedbackByStudent(User student) {
        return this.feedbackRepository.findAllByStudent(student);
    }

    @Override
    public List<Feedback> findFeedbackByStudentCourseAndSemester(User student, Course course, Semester semester) {
        return feedbackRepository.findAllByStudentAndCourseAndSemester(student, course, semester);
    }

    private AverageFeedback getAverageFeedbackFromList(List<Feedback> feedbacks) {
        AverageFeedback averageFeedback = new AverageFeedback();

        double organization = 0;
        double workload = 0;
        double didatic = 0;
        double evaluationSystem = 0;
        double courseware = 0;

        double quantityFeedbacks = Math.max(feedbacks.size(), 1);


        for (Feedback feedback : feedbacks) {
            organization += feedback.getOrganization();
            workload += feedback.getWorkload();
            didatic += feedback.getDidactic();
            evaluationSystem += feedback.getEvaluationSystem();
            courseware += feedback.getCourseware();

        }

        averageFeedback.setAverageOrganization(organization/quantityFeedbacks);
        averageFeedback.setAverageWorkload(workload/quantityFeedbacks);
        averageFeedback.setAverageDidactic(didatic/quantityFeedbacks);
        averageFeedback.setAverageEvaluationSystem(evaluationSystem/quantityFeedbacks);
        averageFeedback.setAverageCourseware(courseware/quantityFeedbacks);


        return averageFeedback;
    }

}
