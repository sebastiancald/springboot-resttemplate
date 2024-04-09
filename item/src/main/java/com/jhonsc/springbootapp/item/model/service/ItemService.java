package com.jhonsc.springbootapp.item.model.service;

import java.util.List;

import com.jhonsc.springbootapp.item.model.Item;

public interface ItemService {
	
	List<Item> findAll();
	Item findById(Long id, Long quantity);

}
