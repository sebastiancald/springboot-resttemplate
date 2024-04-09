package com.jhonsc.springbootapp.product.models.service;

import java.util.List;

import com.jhonsc.springbootapp.product.models.entity.ProductEntity;

public interface IProductService {
	
	List<ProductEntity> findAll();
	ProductEntity findById(Long id);
	

}
