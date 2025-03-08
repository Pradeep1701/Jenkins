package com.jenkins.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class Controller {
	
	
	@PostMapping("/display")
	public void display() {
		System.out.println("Service A is displaying Properly");
	}

}
