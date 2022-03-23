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

    @RequestMapping(value = "/Reaction", method = RequestMethod.POST)
    public ResponseEntity<?> createReaction(@RequestBody ReactionDTO reactionDTO) {
        Optional<Comment> optionalComment = commentService.findCommentById(reactionDTO.getIdComment());

        Optional<User> user = userService.getUserById(reactionDTO.getIdStudent());

        if (!optionalComment.isPresent()){
            return ErroComment.erroCommentNotFound();
        }
        if (!user.isPresent()){
            return ErroUser.erroUserNotFound();
        }
        Reaction newReaction = new Reaction(reactionDTO);
        try {
            reactionService.saveReaction(newReaction);
            reactionService.updateVotes(optionalComment.get(), newReaction,user.get());
            return new ResponseEntity<>(newReaction, HttpStatus.CREATED);
        }catch (Error e){
            return new ResponseEntity<CustomErrorType>(
                    new CustomErrorType("Error, reaction can´t be created"), HttpStatus.BAD_REQUEST);
        }
    }


    @RequestMapping(value = "/Reactions", method = RequestMethod.GET)
    public ResponseEntity<?> getAllReactions(){
        List<Reaction> reactions = this.reactionService.listReactions();
        return new ResponseEntity<>(reactions, HttpStatus.OK);
    }

    @RequestMapping(value = "/Reaction/listByComment/{idComment}", method = RequestMethod.GET)
    public ResponseEntity<?> getAllReactionsFromComment(@PathVariable("idComment") Long idComment){
        Optional<Comment> optionalComment = commentService.findCommentById(idComment);

        if (!optionalComment.isPresent()){
            return ErroComment.erroCommentNotFound();
        }
        List<Reaction> reactions = reactionService.findReactionByComment(idComment);
        return new ResponseEntity<>(reactions, HttpStatus.FOUND);

    }

    @RequestMapping(value = "/Reaction/{id}", method = RequestMethod.GET)
    public ResponseEntity<?> getReaction(@PathVariable("id") Long id){
        Optional<Reaction> optionalReaction = reactionService.findReactionById(id);

        if(!optionalReaction.isPresent())
            return ErroReaction.erroReactionNotFound();

        return new ResponseEntity<>(optionalReaction, HttpStatus.FOUND);
    }

    @RequestMapping(value = "/Reaction/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<?> removeReaction(@PathVariable ("id") Long id,@RequestParam Long idUser){
        Optional<Reaction> optionalReaction = reactionService.findReactionById(id);

        if(!optionalReaction.isPresent())
            return ErroReaction.erroReactionNotFound();
        List<Reaction> userReaction= reactionService.findReactionByStudentAndComment(id,idUser);
        Optional<User> user = userService.getUserById(idUser);
        if (userReaction.isEmpty() || !user.get().getIsAdmin()){
            return ErroReaction.erroReactionNotAccessible();
        }
        Optional<Comment> comment =commentService.findCommentById(optionalReaction.get().getIdComment());

        try{
            reactionService.removeVotes(comment.get(), optionalReaction.get(),user.get());
            reactionService.removeReaction(id);
            return new ResponseEntity<>(optionalReaction, HttpStatus.OK);
        }catch (Error e ){
            return new ResponseEntity<CustomErrorType>(
                    new CustomErrorType("Error, reaction can´t be deleted"), HttpStatus.BAD_REQUEST);
        }

    }

}

