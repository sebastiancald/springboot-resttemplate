package com.jhonsc.springbootapp.product.models.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jhonsc.springbootapp.product.models.entity.ProductEntity;
import com.jhonsc.springbootapp.product.models.repository.ProductRepository;
import com.jhonsc.springbootapp.product.models.service.IProductService;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class ProductServiceImpl implements IProductService {

	private final ProductRepository productRepository;

	@Override
	@Transactional(readOnly = true)
	public List<ProductEntity> findAll() {
		return productRepository.findAll();
	}

	@Override
	public ProductEntity findById(Long id) {

		return productRepository.findById(id).orElseThrow(() -> new RuntimeException("Id no encontrado."));
	}

}
