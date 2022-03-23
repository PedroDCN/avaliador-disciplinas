package com.engSoft.repositories;


import com.engSoft.entities.Reaction;
import com.engSoft.util.Util;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ReactionRepository extends JpaRepository<Reaction, Long> {
    List<Reaction> findAllByIdCommentAndIdStudent(Long idComment,Long idStudent);
    List<Reaction> findReactionByIdComment(Long idComment);
    List<Reaction> findAllByIdCommentAndReactionTypeEnum(Long idComment, Util.ReactionTypeEnum reactionTypeEnum);
    List<Reaction> findAllByReactionTypeEnum(Util.ReactionTypeEnum reaction);
}
