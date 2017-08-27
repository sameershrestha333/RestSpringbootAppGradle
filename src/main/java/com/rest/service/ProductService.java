package com.rest.service;

import java.util.List;

import com.rest.model.Product;

public interface ProductService {
	public List<Product> findAll();
	public Product find(int id);
}
