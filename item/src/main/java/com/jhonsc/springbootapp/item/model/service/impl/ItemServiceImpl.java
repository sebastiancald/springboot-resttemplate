package com.jhonsc.springbootapp.item.model.service.impl;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.jhonsc.springbootapp.item.model.Item;
import com.jhonsc.springbootapp.item.model.Product;
import com.jhonsc.springbootapp.item.model.service.ItemService;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class ItemServiceImpl implements ItemService {

	private final RestTemplate restTemplate;

	@Override
	public List<Item> findAll() {
		List<Product> productList = Arrays
				.asList(restTemplate.getForObject("http://localhost:8000/list", Product[].class));
		return productList.stream().map(product -> new Item(product, 1L)).collect(Collectors.toList());
	}

	@Override
	public Item findById(Long id, Long quantity) {
		Map<String, String> pathVariable = new HashMap<String, String>();
		pathVariable.put("id", id.toString());
		Product product = restTemplate.getForObject("http://localhost:8000/product/{id}", Product.class, pathVariable);
		
		return new Item(product, quantity);
	}

}
