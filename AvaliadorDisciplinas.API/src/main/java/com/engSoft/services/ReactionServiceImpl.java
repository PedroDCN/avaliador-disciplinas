package com.engSoft.services;

import com.engSoft.entities.Comment;
import com.engSoft.entities.Reaction;
import com.engSoft.entities.User;
import com.engSoft.repositories.ReactionRepository;
import com.engSoft.util.Util;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class ReactionServiceImpl implements  ReactionService{
    @Autowired
    private ReactionRepository reactionRepository;

    @Override
    public void saveReaction(Reaction reaction) {
        this.reactionRepository.save(reaction);
    }

    @Override
    public List<Reaction> listReactions() {
        return this.reactionRepository.findAll();
    }

    @Override
    public List<Reaction> findReactionByStudentAndComment(Long idComment,Long idStudent) {
        return this.reactionRepository.findAllByIdCommentAndIdStudent(idComment,idStudent);
    }

    @Override
    public void removeReaction(Long idReaction) {
        this.reactionRepository.deleteById(idReaction);
    }

    @Override
    public Optional<Reaction> findReactionById(Long id) {
        return this.reactionRepository.findById(id);
    }

    @Override
    public void updateVotes(Comment comment, Reaction reaction,User user){
        if (reaction.getReactionTypeEnum()== Util.ReactionTypeEnum.LIKE){
            comment.setUp(comment.getUp()+1);
        }else if (reaction.getReactionTypeEnum()== Util.ReactionTypeEnum.COMPLAINT){
            comment.setComplaints(comment.getComplaints()+1);
            user.setReportedComments(user.getReportedComments()+1);
        }
        else {
            comment.setDown(comment.getDown()+1);
        }
    }

    @Override
    public void removeVotes(Comment comment, Reaction reaction, User user) {
        if (reaction.getReactionTypeEnum()== Util.ReactionTypeEnum.LIKE){
            comment.setUp(comment.getUp()-1);
        }else if (reaction.getReactionTypeEnum()== Util.ReactionTypeEnum.COMPLAINT){
            comment.setComplaints(comment.getComplaints()-1);
            user.setReportedComments(user.getReportedComments()-1);
        }
        else {
            comment.setDown(comment.getDown()-1);
        }
    }

    @Override
    public List<Reaction> findReactionByComment(Long idComment) {
        return reactionRepository.findReactionByIdComment(idComment);
    }

    @Override
    public List<Reaction> findAllByIdCommentAndReactionTypeEnum(Long idComment, Util.ReactionTypeEnum reactionTypeEnum) {
        return reactionRepository.findAllByIdCommentAndReactionTypeEnum(idComment, reactionTypeEnum);
    }

    @Override
    public List<Reaction> findAllByReactionTypeEnum(Util.ReactionTypeEnum reactionTypeEnum){
        return reactionRepository.findAllByReactionTypeEnum(reactionTypeEnum);
    }

}
