package com.Contact.runner;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.Contact.service.UserService;

@Component
public class Runner implements CommandLineRunner{
	@Autowired
	private UserService userServ;
	@Override
	public void run(String... args) throws Exception {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Welcome User");
		
		
		
		
		
	}

	
}
