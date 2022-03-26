package com.engSoft.controllers;


import com.engSoft.DTO.ReactionDTO;
import com.engSoft.entities.*;
import com.engSoft.services.*;
import com.engSoft.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
@RestController
@RequestMapping("/api")
@CrossOrigin
public class ReactionController {

    @Autowired
    CommentService commentService;

    @Autowired
    UserService userService;

    @Autowired
    ReactionService reactionService;

    @RequestMapping(value = "/reaction", method = RequestMethod.POST)
    public ResponseEntity<?> createReaction(@RequestBody ReactionDTO reactionDTO) {

        if (reactionDTO.getReactionTypeEnum() == Util.ReactionTypeEnum.COMPLAINT)
            return ErroReaction.erroInvalidTypeForOperation(reactionDTO.getReactionTypeEnum().toString(), "Like/dislike");

        Optional<Comment> optionalComment = commentService.findCommentById(reactionDTO.getIdComment());

        Optional<User> user = userService.getUserById(reactionDTO.getIdStudent());

        if (!optionalComment.isPresent()) {
            return ErroComment.erroCommentNotFound();
        }
        if (!user.isPresent()) {
            return ErroUser.erroUserNotFound();
        }
        Reaction newReaction = new Reaction(reactionDTO);
        try {
            reactionService.saveReaction(newReaction);
            reactionService.updateVotes(optionalComment.get(), newReaction, user.get());
            userService.saveUser(user.get());
            commentService.saveComment(optionalComment.get());
            return new ResponseEntity<>(newReaction, HttpStatus.CREATED);
        }catch (Error e){
            return new ResponseEntity<>(
                    new CustomErrorType("Error, reaction can´t be created"), HttpStatus.BAD_REQUEST);
        }
    }


    @RequestMapping(value = "/reactions", method = RequestMethod.GET)
    public ResponseEntity<?> getAllReactions() {
        List<Reaction> reactions = this.reactionService.listReactions();
        reactions.removeIf(r -> r.getReactionTypeEnum() == Util.ReactionTypeEnum.COMPLAINT);
        return new ResponseEntity<>(reactions, HttpStatus.ACCEPTED);
    }

    @RequestMapping(value = "/reaction/listByComment/{idComment}", method = RequestMethod.GET)
    public ResponseEntity<?> getAllReactionsFromComment(@PathVariable("idComment") Long idComment) {
        Optional<Comment> optionalComment = commentService.findCommentById(idComment);

        if (!optionalComment.isPresent()) {
            return ErroComment.erroCommentNotFound();
        }
        List<Reaction> reactions = reactionService.findReactionByComment(idComment);
        return new ResponseEntity<>(reactions, HttpStatus.ACCEPTED);

    }

    @RequestMapping(value = "/reaction/listByStudentAndComment/", method = RequestMethod.GET)
    public ResponseEntity<?> getAllReactionsFromComment(@RequestParam("idComment") Long idComment, @RequestParam("idStudent") Long idStudent) {

        Optional<Comment> optionalComment = commentService.findCommentById(idComment);
        if (!optionalComment.isPresent()) {
            return ErroComment.erroCommentNotFound();
        }
        Optional<User> optionalUser = userService.getUserById(idStudent);
        if (!optionalUser.isPresent())
            return  ErroUser.erroUserNotFound();
        List<Reaction> reactions = reactionService.findReactionByStudentAndComment(idStudent, idComment);
        return new ResponseEntity<>(reactions, HttpStatus.ACCEPTED);

    }

    @RequestMapping(value = "/reaction/{id}", method = RequestMethod.GET)
    public ResponseEntity<?> getReaction(@PathVariable("id") Long id) {
        Optional<Reaction> optionalReaction = reactionService.findReactionById(id);

        if (!optionalReaction.isPresent())
            return ErroReaction.erroReactionNotFound();

        return new ResponseEntity<>(optionalReaction, HttpStatus.ACCEPTED);
    }

    @RequestMapping(value = "/reaction/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<?> removeReaction(@PathVariable("id") Long id, @RequestParam("idUser") Long idUser) {
        Optional<Reaction> optionalReaction = reactionService.findReactionById(id);

        if (!optionalReaction.isPresent())
            return ErroReaction.erroReactionNotFound();
        Optional<User> user = userService.getUserById(idUser);

        Optional<Comment> comment = commentService.findCommentById(optionalReaction.get().getIdComment());

        if (optionalReaction.get().getReactionTypeEnum() == Util.ReactionTypeEnum.COMPLAINT)
            return ErroReaction.erroInvalidTypeForOperation(optionalReaction.get().getReactionTypeEnum().toString(), "Like/dislike");

        if (!user.isPresent())
            return ErroUser.erroUserNotFound();
        if (!comment.isPresent())
            return ErroComment.erroCommentNotFound();

        try {
            reactionService.removeVotes(comment.get(), optionalReaction.get(), user.get());
            reactionService.removeReaction(id);
            userService.saveUser(user.get());
            commentService.saveComment(comment.get());
            return new ResponseEntity<>(optionalReaction, HttpStatus.OK);
        }catch (Error e ){
            return new ResponseEntity<>(
                    new CustomErrorType("Error, reaction can´t be deleted"), HttpStatus.BAD_REQUEST);
        }

    }

    @RequestMapping(value = "/reaction/{id}", method = RequestMethod.PUT)
    public ResponseEntity<?> updateReaction(@PathVariable("id") Long id, @RequestBody Util.ReactionTypeEnum reactionType) {
        Optional<Reaction> optionalReaction = reactionService.findReactionById(id);
        if(!optionalReaction.isPresent())
            return ErroReaction.erroReactionNotFound();

        if(reactionType== Util.ReactionTypeEnum.COMPLAINT || optionalReaction.get().getReactionTypeEnum()== Util.ReactionTypeEnum.COMPLAINT)
            return ErroReaction.erroInvalidTypeForOperation(reactionType.toString(), "Like, Dislike");

        Reaction oldReaction = optionalReaction.get();
        if (oldReaction.getReactionTypeEnum()==reactionType)
            return new ResponseEntity<>(
                    new CustomErrorType("Error, reaction can´t be Updated"), HttpStatus.BAD_REQUEST);

        Optional<Comment> comment = commentService.findCommentById(oldReaction.getIdComment());
        Optional<User> user = userService.getUserById(oldReaction.getIdStudent());

        if (!user.isPresent())
            return ErroUser.erroUserNotFound();
        if (!comment.isPresent())
            return ErroComment.erroCommentNotFound();

        reactionService.removeVotes(comment.get(), oldReaction, user.get());
        oldReaction.setReactionTypeEnum(reactionType);
        reactionService.updateVotes(comment.get(), oldReaction, user.get());
        reactionService.saveReaction(oldReaction);
        userService.saveUser(user.get());
        commentService.saveComment(comment.get());
        return new ResponseEntity<>(oldReaction, HttpStatus.OK);
    }
}
