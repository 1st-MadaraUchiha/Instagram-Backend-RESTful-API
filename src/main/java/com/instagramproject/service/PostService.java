package com.instagramproject.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.instagramproject.Model.Post;
import com.instagramproject.repository.PostRepository;
import com.instagramproject.repository.UserRepository;

@Service
public class PostService {
	
	@Autowired
	PostRepository postRepository;
	
	@Autowired
	UserRepository userRepository;
	
	public Post getPost(int id) {
		Post post = postRepository.getPost(id);
		post.setUserName(userRepository.getById(postRepository.getPost(id).getUserId()).getUserName());
		return post;
	}
	
	public Post addPost(Post post) {
		return postRepository.save(post);
	}

}
