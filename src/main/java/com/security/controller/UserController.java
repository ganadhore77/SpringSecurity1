package com.security.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.security.entity.User;
import com.security.service.UserService;

@RestController
public class UserController {
	
	@Autowired
	private UserService userService;

	@PostMapping("/register")
	public User register(@RequestBody User user) {
		
		User dbuser = userService.register(user);
		
		return dbuser;
	}
	
	@GetMapping("/getUsers")
	public List<User> getUsers() {
		
		List<User> dbuser = userService.getUsers();
		
		return dbuser;
	}
	
}
