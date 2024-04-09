package com.jhonsc.springbootapp.product.models.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jhonsc.springbootapp.product.models.entity.ProductEntity;

@Repository
public interface ProductRepository extends JpaRepository<ProductEntity, Long> {

}
