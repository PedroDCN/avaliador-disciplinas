package com.engSoft.services;

import com.engSoft.entities.Comment;
import com.engSoft.entities.Reaction;
import com.engSoft.entities.User;
import com.engSoft.util.Util;

import java.util.List;
import java.util.Optional;

public interface ReactionService {
    void saveReaction(Reaction reaction);
    List<Reaction> listReactions();

    List<Reaction> findReactionByStudentAndComment(Comment comment, User student);

    void removeReaction(Long idFeedback);
    Optional<Reaction> findReactionById(Long id);
    void updateVotes(Comment comment, Reaction reaction, User user);
    void removeVotes(Comment comment, Reaction reaction, User user);

    List<Reaction> findReactionByComment(Comment comment);

    List<Reaction> findAllByIdCommentAndReactionTypeEnum(Comment comment, Util.ReactionTypeEnum reactionTypeEnum);

    List<Reaction> findAllByReactionTypeEnum(Util.ReactionTypeEnum reactionTypeEnum);
}
