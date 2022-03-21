package com.engSoft.entities;

import com.engSoft.DTO.ReactionDTO;
import com.engSoft.util.Util;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
@Entity
public class Reaction {
    @Id
    @GeneratedValue
    private Long id;
    private Long idComment;
    private Long idStudent;
    private Util.ReactionTypeEnum reactionTypeEnum;

    public Reaction(ReactionDTO reactionDTO) {
        this.idStudent=reactionDTO.getIdStudent();
        this.idComment=reactionDTO.getIdComment();
        this.reactionTypeEnum=reactionDTO.getReactionTypeEnum();
    }

    public Reaction() {

    }

    public Util.ReactionTypeEnum getReactionTypeEnum() {
        return reactionTypeEnum;
    }

    public Long getIdComment() {
        return idComment;
    }
}
