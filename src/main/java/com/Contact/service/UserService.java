package com.Contact.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Contact.Repo.UserRepo;
import com.Contact.model.Users;

@Service
public class UserService {
	@Autowired
	private UserRepo userRepo;

	public void add(Users user) {
		if (user.getEmail().length() > 13 && user.getEmail().contains("gmail.com") && user.getName().length() > 5) {
			System.out.println("users add");
			userRepo.save(user);
		}

	}

}
