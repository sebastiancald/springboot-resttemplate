package com.jhonsc.springbootapp.item.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.jhonsc.springbootapp.item.model.Item;
import com.jhonsc.springbootapp.item.model.service.ItemService;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@RestController
public class ItemController {
	
	private final ItemService service;
	
	@GetMapping("/list")
	public List<Item> findAllItems(){
		return service.findAll();
	}
	
	@GetMapping("detail/{id}/quantity/{quantity}")
	public Item detail(@PathVariable Long id, @PathVariable Long quantity) {
		return service.findById(id, quantity);
	}

}
