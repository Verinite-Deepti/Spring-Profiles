package com.springprofiles.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springprofiles.entity.User;
import com.springprofiles.repository.UserRepo;

@RestController
@RequestMapping()
public class UserController {

	
	
	@Autowired
	private UserRepo userRepo;
	
	@PostMapping("/insert")
	public void insertUser(@RequestBody User user) {
		
		userRepo.save(user);
		
	}
	
	@GetMapping("/get")
	public List<User> getAllUsers(){
		return userRepo.findAll();
	}
}
