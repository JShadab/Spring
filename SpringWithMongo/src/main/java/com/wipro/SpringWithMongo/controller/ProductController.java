package com.wipro.SpringWithMongo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wipro.SpringWithMongo.entity.Product;
import com.wipro.SpringWithMongo.service.ProductService;

@RestController
public class ProductController {

	@Autowired
	private ProductService productService;

	@GetMapping("/getProducts")
	public List<Product> getAllProducts() {

		return productService.getAllProducts();
	}

	@GetMapping("/getProduct/{id}")
	public Optional<Product> getProduct(@PathVariable String id) {
		return productService.getProduct(id);

	}

	@PostMapping("/saveProduct")
	public void saveProduct(Product product) {
		productService.saveProduct(product);

	}

	@PutMapping("/updateProduct")
	public void updateProduct(Product product) {
		productService.updateProduct(product);

	}

	@DeleteMapping("/deleteProduct/{id}")
	public void deleteProduct(@PathVariable String id) {
		productService.deleteProduct(id);

	}
}
