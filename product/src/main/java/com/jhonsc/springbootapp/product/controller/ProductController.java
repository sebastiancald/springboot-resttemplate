package com.jhonsc.springbootapp.product.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.jhonsc.springbootapp.product.models.entity.ProductEntity;
import com.jhonsc.springbootapp.product.models.service.IProductService;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@RestController
public class ProductController {
	
	private final IProductService productService;
	
	@GetMapping("/list")
	public List<ProductEntity> findAllProducts(){
		return productService.findAll();
	}
	
	@GetMapping("/product/{id}")
	public ProductEntity findProductById(@PathVariable Long id) {
		return productService.findById(id);
	}

}
