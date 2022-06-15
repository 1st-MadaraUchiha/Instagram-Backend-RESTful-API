 package com.instagramproject.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.instagramproject.Model.User;
import com.instagramproject.service.UserService;

@RestController
public class UserController {
	
	@Autowired
	UserService userService;

	@PostMapping("/user")
	public User postUser(@RequestBody User user) {
		return userService.postUser(user);
	}
	
	@GetMapping("/user/{id}")
	public Optional<User> getUser(@PathVariable("id")int id) {
		return userService.getUser(id);
	}
	
}
