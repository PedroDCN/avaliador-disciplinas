package com.engSoft.services;

import com.engSoft.entities.AvarageFeedback;
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
    public AvarageFeedback avarageFeedbackByCourse(Long idCourse) {
        List<Feedback> feedbacks = this.feedbackRepository.findAllByIdCourse(idCourse);

        AvarageFeedback avarageFeedback = new AvarageFeedback();

        double organization = 0;
        double workload = 0;
        double didatic = 0;
        double evaluationSystem = 0;
        double courseware = 0;

        double quantityFeedbacks = feedbacks.size();


        for (Feedback feedback : feedbacks) {
            organization += feedback.getOrganization();
            workload += feedback.getWorkload();
            didatic += feedback.getDidactic();
            evaluationSystem += feedback.getEvaluationSystem();
            courseware += feedback.getCourseware();

        }

        avarageFeedback.setAvarageOrganization(organization/quantityFeedbacks);
        avarageFeedback.setAvarageWorkload(workload/quantityFeedbacks);
        avarageFeedback.setAvarageDidactic(didatic/quantityFeedbacks);
        avarageFeedback.setAvarageEvaluationSystem(evaluationSystem/quantityFeedbacks);
        avarageFeedback.setAvarageCourseware(courseware/quantityFeedbacks);


        return avarageFeedback;
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
    public List<Feedback> findFeedbakByCourseAndSemester(Long idCourse, Long idSemester) {


        return this.feedbackRepository.findAllByIdCourseAndIdSemester(idCourse, idSemester);
    }

    @Override
    public AvarageFeedback avarageFeedbackByCourseAndSemester(Long idCourse, Long idSemester) {
            List<Feedback> feedbacks = this.feedbackRepository.findAllByIdCourseAndIdSemester(idCourse, idSemester);

            AvarageFeedback avarageFeedback = new AvarageFeedback();

            double organization = 0;
            double workload = 0;
            double didatic = 0;
            double evaluationSystem = 0;
            double courseware = 0;

            double quantityFeedbacks = feedbacks.size();


        for (Feedback feedback : feedbacks) {
            organization += feedback.getOrganization();
            workload += feedback.getWorkload();
            didatic += feedback.getDidactic();
            evaluationSystem += feedback.getEvaluationSystem();
            courseware += feedback.getCourseware();

        }

            avarageFeedback.setAvarageOrganization((organization/quantityFeedbacks));
            avarageFeedback.setAvarageWorkload(workload/quantityFeedbacks);
            avarageFeedback.setAvarageDidactic(didatic/quantityFeedbacks);
            avarageFeedback.setAvarageEvaluationSystem(evaluationSystem/quantityFeedbacks);
            avarageFeedback.setAvarageCourseware(courseware/quantityFeedbacks);


            return avarageFeedback;

    }

    @Override
    public List<Feedback> findFeedbackByStudent(Long idStudent) {
        return this.feedbackRepository.findAllByIdStudent(idStudent);
    }


}
