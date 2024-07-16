package com.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.configuration.OrderRegistration;

public interface OrderRepo extends CrudRepository<OrderRegistration, Integer>
{
	List<OrderRegistration> findAll();
	
	public List<OrderRegistration> findByBusername(String busername);

}
