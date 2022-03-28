package com.cursojava.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cursojava.curso.entities.OrderItem;


public interface OderItemRepository extends JpaRepository<OrderItem, Long>{
	
}
