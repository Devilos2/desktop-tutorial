package com.Contact.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NonNull;

@Data
@Entity
public class Users {
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Id
	private int id;

	@NonNull
	private String name;
	
	@NonNull
	private String email;
	
}
