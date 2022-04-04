package com.engSoft.entities;

import com.engSoft.util.Util;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.*;

@Entity
public class Reaction {
    @Id
    @GeneratedValue
    private Long id;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "comment_id")
    @OnDelete(action = OnDeleteAction.CASCADE)
    private Comment comment;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "student_id")
    @OnDelete(action = OnDeleteAction.CASCADE)
    private User student;

    private Util.ReactionTypeEnum reactionTypeEnum;

    public Reaction(Comment comment, User student, Util.ReactionTypeEnum reactionTypeEnum) {
        this.comment = comment;
        this.student = student;
        this.reactionTypeEnum = reactionTypeEnum;
    }

    public Reaction() {

    }

    public Comment getComment() {
        return comment;
    }

    public void setComment(Comment comment) {
        this.comment = comment;
    }

    public User getStudent() {
        return student;
    }

    public void setStudent(User student) {
        this.student = student;
    }

    public Util.ReactionTypeEnum getReactionTypeEnum() {
        return reactionTypeEnum;
    }

    public void setReactionTypeEnum(Util.ReactionTypeEnum reactionTypeEnum) {
        this.reactionTypeEnum = reactionTypeEnum;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
