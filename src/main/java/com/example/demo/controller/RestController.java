package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.dao.User;
import com.example.demo.sservice.UserService;

@org.springframework.web.bind.annotation.RestController

public class RestController {

	@Autowired
	private UserService userService;
	@GetMapping("/hello")
	public String helloWorld() {
		return "Hello World";
		
	}
	
	@GetMapping("/saveuser")
	public String saveUser(@RequestParam String username,
			@RequestParam String firstname,@RequestParam String lastname,@RequestParam String password) {
		User user=new User(username, firstname, lastname, password);
		userService.saveuserdata(user);
		return "User Saved";
		
		
	}
}
