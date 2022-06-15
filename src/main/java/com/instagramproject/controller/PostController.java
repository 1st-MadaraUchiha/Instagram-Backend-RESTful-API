package com.instagramproject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.instagramproject.Model.Post;
import com.instagramproject.service.PostService;

@RestController
public class PostController {
	@Autowired
	PostService postService;
	
	@PostMapping("/post")
	public Post addPost(@RequestBody Post post) {
		return postService.addPost(post);
	}
	
	@GetMapping("post/{Id}")
	public Post getPost(@PathVariable("Id")int postId) {
		return postService.getPost(postId);
	}
}
