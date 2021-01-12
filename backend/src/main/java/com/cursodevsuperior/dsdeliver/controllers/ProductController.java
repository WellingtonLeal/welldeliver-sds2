package com.cursodevsuperior.dsdeliver.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cursodevsuperior.dsdeliver.dto.ProductDto;
import com.cursodevsuperior.dsdeliver.services.ProductService;

@RestController
@RequestMapping(value = "/products")
public class ProductController {
	
	@Autowired
	private ProductService service;
	
	@GetMapping
	public ResponseEntity<List<ProductDto>> findAll(){
		List<ProductDto> list = service.findAll();
		return ResponseEntity.ok().body(list);
		
	}
	

}
