package com.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.rest.model.Product;
import com.rest.service.ProductService;

@RestController
@RequestMapping("product")
public class ProductController {

	
	@Autowired
	private ProductService productService;
	
	//@RequestMapping(method= RequestMethod.GET)
	@GetMapping
	public List<Product> getAllproduct(){
		return productService.findAll();
	}
	@GetMapping("{id}")
	public Product getProduct(@PathVariable("id") int id) {
		return productService.find(id);
		
	}
	
}
