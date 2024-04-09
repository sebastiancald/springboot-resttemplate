package com.jhonsc.springbootapp.item.model;

import java.math.BigDecimal;
import java.time.LocalDate;

import lombok.Data;

@Data
public class Product {
	
	private Long id;
	
	private String productName;
	
	private BigDecimal price;
	
	private LocalDate createAt;

}
