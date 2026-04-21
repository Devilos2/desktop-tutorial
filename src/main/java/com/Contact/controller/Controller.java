package com.Contact.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Contact.model.Users;
import com.Contact.service.UserService;

@RestController
public class Controller {
	@Autowired
	private UserService userServ;
	
	@PostMapping("/add")
	public void add( @RequestBody Users user)
	{
		System.out.println("ctrl");
		userServ.add(user);
	}

}
