package com.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.configuration.UserRegistration;

public interface UserRepo extends CrudRepository<UserRegistration, String>{

	public UserRegistration findByEmailAndPassword(String email,String password);
	
	List<UserRegistration> findAll();
	

}
