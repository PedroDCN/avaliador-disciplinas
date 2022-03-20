package com.engSoft.services;

import com.engSoft.entities.Comment;
import com.engSoft.entities.Reaction;
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
    public void updateVotes(Comment comment, Reaction reaction){
        if (reaction.getReactionTypeEnum()== Util.ReactionTypeEnum.LIKE){
            comment.setUp(comment.getUp()+1);
        }else {
            comment.setDown(comment.getDown()+1);
        }
    }

    @Override
    public void removeVotes(Comment comment, Reaction reaction) {
        if (reaction.getReactionTypeEnum()== Util.ReactionTypeEnum.LIKE){
            comment.setUp(comment.getUp()-1);
        }else {
            comment.setDown(comment.getDown()-1);
        }
    }

    @Override
    public List<Reaction> findReactionByComment(Long idComment) {
        return reactionRepository.findReactionByIdComment(idComment);
    }
}
