package com.instagramproject.service;


import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.instagramproject.Model.User;
import com.instagramproject.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	UserRepository userRepository;

	public User postUser(User user) {
		return userRepository.save(user);
	}
	
	public User getUserById(int userId) {
		User user = userRepository.findByUserId(userId);
		return user;
	}
	public Optional<User> getUser(int userId) {
		Optional<User> user = userRepository.findById(userId);
		return user;
	}
	
	public User getUserData(int id) {
		return userRepository.getOne(id);
	}
}
