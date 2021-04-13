package com.example.demo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.OrderItem;
import com.example.demo.repositories.OrderItemRepository;

//this item must be registered as a component for the dependency injection works (autowired)
@Service
public class OrderItemService {
	
	@Autowired
	private OrderItemRepository repository;
	
	public List<OrderItem> findAll(){
		return repository.findAll();
	}
	
	public OrderItem findById(Long id) {
		Optional<OrderItem> orderItem = repository.findById(id);
		return orderItem.get();
	}

}
