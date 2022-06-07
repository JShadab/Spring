package com.wipro.SpringWithMongo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wipro.SpringWithMongo.entity.Product;
import com.wipro.SpringWithMongo.repository.ProductRepository;

@Service

public class ProductService {

	@Autowired
	private ProductRepository productRepository;

	public List<Product> getAllProducts() {

		return productRepository.findAll();
	}

	public Optional<Product> getProduct(String id) {
		return productRepository.findById(id);

	}

	public void saveProduct(Product product) {

		productRepository.save(product);
		logInfo();

	}

	public void updateProduct(Product product) {
		productRepository.save(product);

	}

	public void deleteProduct(String id) {
		productRepository.deleteById(id);

	}

	public void logInfo() {

		System.out.println("Papa Nahi Manenge.....");

	}
}
