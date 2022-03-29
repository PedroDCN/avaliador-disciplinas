package com.engSoft.services;

import com.engSoft.entities.AverageFeedback;
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
    public AverageFeedback averageFeedbackByCourse(Long idCourse) {
        List<Feedback> feedbacks = this.feedbackRepository.findAllByIdCourse(idCourse);

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
    public List<Feedback> findFeedbackBySemester(Long idSemester) {
        return this.feedbackRepository.findAllByIdSemester(idSemester);
    }

    @Override
    public List<Feedback> findFeedbackByCourseAndSemester(Long idCourse, Long idSemester) {


        return this.feedbackRepository.findAllByIdCourseAndIdSemester(idCourse, idSemester);
    }

    @Override
    public AverageFeedback averageFeedbackByCourseAndSemester(Long idCourse, Long idSemester) {
        List<Feedback> feedbacks = this.feedbackRepository.findAllByIdCourseAndIdSemester(idCourse, idSemester);

        return getAverageFeedbackFromList(feedbacks);
    }

    @Override
    public List<Feedback> findFeedbackByStudent(Long idStudent) {
        return this.feedbackRepository.findAllByIdStudent(idStudent);
    }

    @Override
    public List<Feedback> findFeedbackByStudentCourseAndSemester(Long idStudent, Long idCourse, Long idSemester) {
        return feedbackRepository.findAllByIdStudentAndIdCourseAndIdSemester(idStudent, idCourse, idSemester);
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
