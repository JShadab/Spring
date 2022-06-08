package com.wipro.SpringWithMongo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

import com.wipro.SpringWithMongo.entity.Product;
import com.wipro.SpringWithMongo.service.ProductService;

@SpringBootTest

class ProductServiceTest {

	@Mock
	ProductService productService;

	static List<Product> products;

	@BeforeAll
	static public void setUp() {

		products = new ArrayList<Product>();

		products.add(new Product("201", "Product-A", 10, "Category-1"));
		products.add(new Product("202", "Product-B", 20, "Category-2"));
		products.add(new Product("203", "Product-C", 30, "Category-3"));

	}

	@Test
	void testGetAllProducts() {

		when(productService.getAllProducts()).thenReturn(products);

		List<Product> allProducts = productService.getAllProducts();

		assertFalse(allProducts == null);
		assertEquals(3, allProducts.size());
	}

	@Test
	void testGetProduct() {

		Product product = new Product("501", "Product-A", 10, "Category-1");

		Optional<Product> productOpt = Optional.of(product);

		when(productService.getProduct("501")).thenReturn(productOpt);

		Optional<Product> resultProductOpt = productService.getProduct("501");

		assertFalse(resultProductOpt.isEmpty());

	}

	@Test
	void testSaveProduct() {

		Product product = new Product("501", "Product-A", 10, "Category-1");

		productService.saveProduct(product);

		verify(productService).saveProduct(product);

		// verify(productService).logInfo(); // at least 1 times

//	verify(productService, atLeastOnce()).logInfo(); // at least 1 times
//		verify(productService, atMostOnce()).logInfo(); // at least 1 times
//		
//		verify(productService, atLeast(1)).logInfo(); // at least 1 times
//		verify(productService, atMost(1)).logInfo(); // at least 1 times
//		
//		verify(productService, times(1)).logInfo(); // at least 1 times

	}

	@Test
	void testUpdateProduct() {

		Product product = new Product("501", "Product-A", 50, "Category-1");

		when(productService.updateProduct(any())).thenReturn(product);

		Product updatedProduct = productService.updateProduct(product);

		assertEquals(updatedProduct.getQuantity(), 50);
	}

	@Test
	void testDeleteProduct() {

		productService.deleteProduct("501");

		verify(productService).deleteProduct("501");
	}

}
