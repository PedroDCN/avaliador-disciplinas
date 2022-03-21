package com.engSoft.services;

import com.engSoft.entities.Comment;
import com.engSoft.entities.Feedback;
import com.engSoft.entities.Reaction;

import java.util.List;
import java.util.Optional;

public interface ReactionService {
    public void saveReaction(Reaction reaction);
    public List<Reaction> listReactions();
    public List<Reaction> findReactionByStudentAndComment(Long idComment,Long idStudent);
    public void removeReaction(Long idFeedback);
    public Optional<Reaction> findReactionById(Long id);
    public void updateVotes(Comment comment,Reaction reaction);
    public void removeVotes(Comment comment,Reaction reaction);
    public List<Reaction> findReactionByComment(Long idComment);
}
