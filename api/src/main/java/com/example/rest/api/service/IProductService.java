package com.example.rest.api.service;

import java.util.List;
import java.util.Optional;

import com.example.rest.api.entity.Product;

public interface IProductService {
	
	
	public List<Product> findByNameList(String name);
	
	
	public List<Product> getAllPro();
	
	
	public void deleteProduct(Long id);
	
	
	public Optional<Product> getProductById(Long id);
	
	
	public void saveProduct(Product storedProduct);
}
