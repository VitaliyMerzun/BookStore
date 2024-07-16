package com.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.configuration.BookRegistration;

public interface BookRepo extends CrudRepository<BookRegistration, String>
{
	List<BookRegistration> findAll();
	

}
