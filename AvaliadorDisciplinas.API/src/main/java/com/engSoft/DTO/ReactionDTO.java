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

    public void setIdComment(Long idComment) {
        this.idComment = idComment;
    }

    public void setIdStudent(Long idStudent) {
        this.idStudent = idStudent;
    }

    public void setReactionTypeEnum(Util.ReactionTypeEnum reactionTypeEnum) {
        this.reactionTypeEnum = reactionTypeEnum;
    }
}
