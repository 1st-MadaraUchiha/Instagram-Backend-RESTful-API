package com.instagramproject.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.instagramproject.Model.Comment;

@Repository
public interface CommentRepository extends JpaRepository<Comment, Integer>{
	
	@Query("SELECT c FROM Comment c WHERE c.postId=:postId")
	List<Comment> getComments(int postId);
	
	@Query("SELECT c FROM Comment c WHERE c.commentId=:commentId")
	Comment getComment(int commentId);
}
