package com.nagarro.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class userController {
	
	@GetMapping("/hello")
	public String Hello() {
		return "Hello!! This is a sample application";
	}

}
