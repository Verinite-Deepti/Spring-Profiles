package com.springprofiles.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springprofiles.entity.User;

public interface UserRepo extends JpaRepository<User,Integer> {

	
	
}
