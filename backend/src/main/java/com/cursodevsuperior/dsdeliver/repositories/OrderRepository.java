package com.cursodevsuperior.dsdeliver.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cursodevsuperior.dsdeliver.entities.Order;


public interface OrderRepository extends JpaRepository<Order, Long>{

}

