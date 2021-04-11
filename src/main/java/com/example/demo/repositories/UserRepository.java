package com.example.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entities.User;

//this is the way to access many repository functions
public interface UserRepository extends JpaRepository<User, Long>{
	
}
