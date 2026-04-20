package com.Contact.Repo;

import org.springframework.data.jpa.repository.JpaRepository;	

import com.Contact.model.Users;

public interface UserRepo extends JpaRepository<Users, Integer> {

}
