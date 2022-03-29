package com.engSoft.DTO;

import com.engSoft.entities.Reaction;
import com.engSoft.util.Util;

public class ReturnReactionDTO {

    private final Long id;
    private final Long idComment;
    private final Long idStudent;
    private final Util.ReactionTypeEnum reactionTypeEnum;

    public ReturnReactionDTO(Reaction reaction) {
        this.id = id;
        this.idComment = idComment;
        this.idStudent = idStudent;
        this.reactionTypeEnum = reactionTypeEnum;
    }
}
