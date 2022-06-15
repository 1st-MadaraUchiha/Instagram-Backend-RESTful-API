package com.instagramproject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.instagramproject.Model.Comment;
import com.instagramproject.service.CommentService;

@RestController
public class CommentController {
	@Autowired
	CommentService commentService;
	
	@PostMapping("/comment")
	public Comment addComment(@RequestBody Comment comment) {
		return commentService.addComment(comment);
	}
	
	@GetMapping("comment/{postId}")
	public List<Comment> getComments(@PathVariable("postId")int postId) {
		return commentService.getComments(postId);
	}
}
