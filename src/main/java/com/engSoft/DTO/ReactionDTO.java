package com.engSoft.DTO;

import com.engSoft.util.Util;

public class ReactionDTO {
    private Long idComment;
    private Long idStudent;
    private Util.ReactionTypeEnum reactionTypeEnum;

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
