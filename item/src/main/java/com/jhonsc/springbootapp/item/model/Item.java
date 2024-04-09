package com.jhonsc.springbootapp.item.model;

import java.math.BigDecimal;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class Item {

	private Product product;
	private Long quantity;
	
	
	public BigDecimal getTotalPrice() {
		return product.getPrice().multiply(BigDecimal.valueOf(quantity));
	}

}
