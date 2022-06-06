package com.wipro.SpringWithMongo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wipro.SpringWithMongo.entity.Product;
import com.wipro.SpringWithMongo.repository.ProductRepository;

@RestController
public class ProductController {

	@Autowired
	private ProductRepository productRepository;

	@GetMapping("/getProducts")
	public List<Product> getAllProducts() {

		return productRepository.findAll();
	}

	@PostMapping("/saveProduct")
	public void saveProduct(Product product) {
		productRepository.save(product);

	}

}
