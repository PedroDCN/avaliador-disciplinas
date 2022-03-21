package com.engSoft.repositories;


import com.engSoft.entities.Reaction;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ReactionRepository extends JpaRepository<Reaction, Long> {
    List<Reaction> findAllByIdCommentAndIdStudent(Long idComment,Long idStudent);
    List<Reaction> findReactionByIdComment(Long idComment);
}
