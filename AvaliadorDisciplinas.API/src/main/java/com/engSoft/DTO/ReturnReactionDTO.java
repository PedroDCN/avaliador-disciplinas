package com.engSoft.DTO;

import com.engSoft.entities.Reaction;
import com.engSoft.util.Util;

public class ReturnReactionDTO {

    private final Long id;
    private final Long idComment;
    private final Long idStudent;
    private final Util.ReactionTypeEnum reactionTypeEnum;

    public ReturnReactionDTO(Reaction reaction) {
        this.id = reaction.getId();
        this.idComment = reaction.getComment().getId();
        this.idStudent = reaction.getStudent().getId();
        this.reactionTypeEnum = reaction.getReactionTypeEnum();
    }

    public Long getId() {
        return id;
    }

    public Long getIdComment() {
        return idComment;
    }

    public Long getIdStudent() {
        return idStudent;
    }

    public Util.ReactionTypeEnum getReactionTypeEnum() {
        return reactionTypeEnum;
    }
}
