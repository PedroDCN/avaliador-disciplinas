package com.engSoft.services;

import com.engSoft.entities.Comment;
import com.engSoft.entities.Feedback;
import com.engSoft.entities.Reaction;

import java.util.List;
import java.util.Optional;

public interface ReactionService {
    void saveReaction(Reaction reaction);
    List<Reaction> listReactions();
    List<Reaction> findReactionByStudentAndComment(Long idComment,Long idStudent);
    void removeReaction(Long idFeedback);
    Optional<Reaction> findReactionById(Long id);
    void updateVotes(Comment comment,Reaction reaction);
    void removeVotes(Comment comment,Reaction reaction);
    List<Reaction> findReactionByComment(Long idComment);
}
