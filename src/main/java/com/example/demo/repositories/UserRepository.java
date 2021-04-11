package com.example.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entities.User;

//this is the way to access many repository functions
//you don't need to put the @Repository register as it extends the jparepository
public interface UserRepository extends JpaRepository<User, Long>{
	
}
