package com.cursodevsuperior.dsdeliver.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cursodevsuperior.dsdeliver.dto.ProductDto;
import com.cursodevsuperior.dsdeliver.entities.Product;
import com.cursodevsuperior.dsdeliver.repositories.ProductRepository;

@Service
public class ProductService {
	
	@Autowired
	private ProductRepository repository;

	@Transactional(readOnly = true)
	public List<ProductDto> findAll(){
		List<Product> list = repository.findAllByOrderByNameAsc();
		return list.stream().map(x -> new ProductDto(x)).collect(Collectors.toList());
	}
}
