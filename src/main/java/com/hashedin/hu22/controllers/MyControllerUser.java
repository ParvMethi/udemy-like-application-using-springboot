package com.hashedin.hu22.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.hashedin.hu22.entities.User;
import com.hashedin.hu22.services.UserService;


@CrossOrigin("*")
@RestController
public class MyControllerUser {
	
	@Autowired
	private UserService userService;
	
	
	//Creating a user
	@PostMapping("/users")
	public User addUser(@RequestBody User user) {
		return this.userService.addUser(user);
	}
	
	//Updating a user
	@PutMapping("/users")
	public User updateUser(@RequestBody User user) {
		return this.userService.updateUser(user);
	}
}

