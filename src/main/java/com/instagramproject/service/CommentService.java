package com.instagramproject.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.instagramproject.Model.Comment;
import com.instagramproject.repository.CommentRepository;
import com.instagramproject.repository.UserRepository;

@Service
public class CommentService {
	
	@Autowired
	CommentRepository commentRepository;
	
	@Autowired
	UserRepository userRepository;
	
	public List<Comment> getComments(int postId) {
		List<Comment> comments = commentRepository.getComments(postId);
		for(Comment c:comments) {
			int cId = c.getCommentId();
			c.setUserName(userRepository.getById(commentRepository.getComment(cId).getUserId()).getUserName());
		}
		return comments;
	}
	
	public Comment addComment(Comment comment) {
	return commentRepository.save(comment);
	}

}
