package com.wipro.SpringWithMongo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.wipro.SpringWithMongo.entity.Product;
import com.wipro.SpringWithMongo.repository.ProductRepository;

@SpringBootApplication
public class SpringWithMongoApplication implements CommandLineRunner {

	@Autowired
	private ProductRepository productRepository;

	public static void main(String[] args) {
		SpringApplication.run(SpringWithMongoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

//		Product product = new Product("101", "Mobile", 20, "ELECTRONICS");

		// saveProduct(product);

//		List<Product> allProducts = getAllProducts();
//
//		System.out.println(allProducts);

	}

	private void saveProduct(Product product) {
		productRepository.save(product);

	}

	private List<Product> getAllProducts() {

		return productRepository.findAll();
	}

}
