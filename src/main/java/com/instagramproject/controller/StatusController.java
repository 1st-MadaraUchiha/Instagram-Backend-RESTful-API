package com.instagramproject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.instagramproject.Model.Status;
import com.instagramproject.service.StatusService;

@RestController
public class StatusController {
	
	@Autowired
	StatusService statusService;
	
	@PostMapping("/status")
	public Status setStatus(@RequestBody Status status) {
		return statusService.setStatus(status);
	}
	
	@GetMapping("/status/{sId}")
	public Status getStatus(@PathVariable("sId") int id) {
		return statusService.getStatus(id);
	}	
}
