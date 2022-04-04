package com.engSoft.repositories;


import com.engSoft.entities.Comment;
import com.engSoft.entities.Reaction;
import com.engSoft.entities.User;
import com.engSoft.util.Util;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ReactionRepository extends JpaRepository<Reaction, Long> {
    List<Reaction> findAllByCommentAndStudent(Comment comment, User student);
    List<Reaction> findReactionByComment(Comment comment);
    List<Reaction> findAllByCommentAndReactionTypeEnum(Comment comment, Util.ReactionTypeEnum reactionTypeEnum);
    List<Reaction> findAllByReactionTypeEnum(Util.ReactionTypeEnum reaction);
    List<Reaction> findAllByIdStudent(Long id);
}
