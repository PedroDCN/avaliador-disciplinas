package com.engSoft.controllers;

import com.engSoft.DTO.ReactionDTO;
import com.engSoft.entities.Comment;
import com.engSoft.entities.Reaction;
import com.engSoft.entities.User;
import com.engSoft.services.CommentService;
import com.engSoft.services.ReactionService;
import com.engSoft.services.UserService;
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
public class ComplaintController {

    @Autowired
    CommentService commentService;

    @Autowired
    UserService userService;

    @Autowired
    ReactionService reactionService;

    @RequestMapping(value = "/Complaint", method = RequestMethod.POST)
    public ResponseEntity<?> createComplaint(@RequestBody ReactionDTO reactionDTO) {

        if(reactionDTO.getReactionTypeEnum() != Util.ReactionTypeEnum.COMPLAINT)
            return ErroReaction.erroInvalidTypeForOperation(reactionDTO.getReactionTypeEnum().toString(), "Complaint");


        Optional<Comment> optionalComment = commentService.findCommentById(reactionDTO.getIdComment());
        if (!optionalComment.isPresent()){
            return ErroComment.erroCommentNotFound();
        }

        Optional<User> user = userService.getUserById(reactionDTO.getIdStudent());
        if (!user.isPresent()){
            return ErroUser.erroUserNotFound();
        }

        Reaction newReaction = new Reaction(reactionDTO);

        try {
            reactionService.saveReaction(newReaction);
            reactionService.updateVotes(optionalComment.get(), newReaction,user.get());
            userService.saveUser(user.get());
            commentService.saveComment(optionalComment.get());
            return new ResponseEntity<>(newReaction, HttpStatus.CREATED);
        }catch (Error e){
            return new ResponseEntity<CustomErrorType>(
                    new CustomErrorType("Error, reaction can´t be created"), HttpStatus.BAD_REQUEST);
        }
    }


    @RequestMapping(value = "/Complaints", method = RequestMethod.GET)
    public ResponseEntity<?> getAllComplaints(){
        List<Reaction> reactions = this.reactionService.findAllByReactionTypeEnum(Util.ReactionTypeEnum.COMPLAINT);
        return new ResponseEntity<>(reactions, HttpStatus.OK);
    }

    @RequestMapping(value = "/Complaints/listByComment/{idComment}", method = RequestMethod.GET)
    public ResponseEntity<?> getAllComplaintsFromComment(@PathVariable("idComment") Long idComment){
        Optional<Comment> optionalComment = commentService.findCommentById(idComment);

        if (!optionalComment.isPresent()){
            return ErroComment.erroCommentNotFound();
        }
        List<Reaction> reactions = reactionService.findAllByIdCommentAndReactionTypeEnum(idComment, Util.ReactionTypeEnum.COMPLAINT);
        return new ResponseEntity<>(reactions, HttpStatus.FOUND);

    }

    @RequestMapping(value = "/Complaint/{id}", method = RequestMethod.GET)
    public ResponseEntity<?> getComplaint(@PathVariable("id") Long id){
        Optional<Reaction> optionalReaction = reactionService.findReactionById(id);

        if(!optionalReaction.isPresent())
            return ErroReaction.erroReactionNotFound();

        return new ResponseEntity<>(optionalReaction, HttpStatus.FOUND);
    }

    @RequestMapping(value = "/Complaint/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<?> removeComplaint(@PathVariable ("id") Long id,@RequestParam Long idUser){
        Optional<Reaction> optionalReaction = reactionService.findReactionById(id);

        if(!optionalReaction.isPresent())
            return ErroReaction.erroReactionNotFound();
        if(optionalReaction.get().getReactionTypeEnum() != Util.ReactionTypeEnum.COMPLAINT)
            return ErroReaction.erroInvalidTypeForOperation(optionalReaction.get().getReactionTypeEnum().toString(), "Complaint");

        Optional<User> user = userService.getUserById(idUser);
        if(!user.isPresent())
            return ErroUser.erroUserNotFound();

        Optional<Comment> comment =commentService.findCommentById(optionalReaction.get().getIdComment());

        try{
            reactionService.removeVotes(comment.get(), optionalReaction.get(),user.get());
            reactionService.removeReaction(id);
            userService.saveUser(user.get());
            commentService.saveComment(comment.get());
            return new ResponseEntity<>(optionalReaction.get(), HttpStatus.OK);
        }catch (Error e ){
            return new ResponseEntity<CustomErrorType>(
                    new CustomErrorType("Error, Complaint can´t be deleted"), HttpStatus.BAD_REQUEST);
        }

    }

}

