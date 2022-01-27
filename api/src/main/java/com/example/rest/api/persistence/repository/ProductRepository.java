package com.example.rest.api.persistence.repository;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.rest.api.entity.Product;

@Repository
@Transactional
public interface ProductRepository extends JpaRepository<Product, Long> {
	public List<Product> findByName(String name);

}
