package com.instagramproject.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.instagramproject.Model.Status;
import com.instagramproject.repository.StatusRepository;


@Service
public class StatusService {
	
	@Autowired
	StatusRepository statusRepository;
	@Autowired
	UserService userService;
	
	public Status getStatus(int id) {
		Status status = new Status();
		status.setUserName(userService.getUserById((statusRepository.find(id)).getUserId()).getUserName());
		return statusRepository.find(id);
	}
	
	public Status setStatus(@RequestBody Status status) {
		return statusRepository.save(status);
	}
	
}
