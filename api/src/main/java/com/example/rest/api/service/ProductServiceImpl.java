package com.example.rest.api.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.rest.api.entity.Product;
import com.example.rest.api.persistence.repository.ProductRepository;

@Service
@Transactional
public class ProductServiceImpl implements IProductService {

	@Autowired
	ProductRepository productRepository;

	@Override
	public List<Product> findByNameList(String name) {

		return productRepository.findByName(name);

	}

	@Override
	public List<Product> getAllPro() {

		return productRepository.findAll();
	}

	@Override
	public void deleteProduct(Long Id) {
		productRepository.deleteById(Id);

	}

	@Override
	public Optional<Product> getProductById(Long id) {

		return productRepository.findById(id);
	}

	@Override
	public void saveProduct(Product storedProduct) {
		productRepository.saveAndFlush(storedProduct);

	}

}
