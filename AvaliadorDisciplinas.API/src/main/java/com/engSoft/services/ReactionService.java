package com.engSoft.services;

import com.engSoft.entities.Comment;
import com.engSoft.entities.Feedback;
import com.engSoft.entities.Reaction;
import com.engSoft.entities.User;
import com.engSoft.util.Util;

import java.util.List;
import java.util.Optional;

public interface ReactionService {
    public void saveReaction(Reaction reaction);
    public List<Reaction> listReactions();
    public List<Reaction> findReactionByStudentAndComment(Long idComment,Long idStudent);
    public void removeReaction(Long idFeedback);
    public Optional<Reaction> findReactionById(Long id);
    public void updateVotes(Comment comment, Reaction reaction, User user);
    public void removeVotes(Comment comment, Reaction reaction,User user);
    public List<Reaction> findReactionByComment(Long idComment);
    List<Reaction> findAllByIdCommentAndReactionTypeEnum(Long idComment, Util.ReactionTypeEnum reactionTypeEnum);
    List<Reaction> findAllByReactionTypeEnum(Util.ReactionTypeEnum reactionTypeEnum);
}
