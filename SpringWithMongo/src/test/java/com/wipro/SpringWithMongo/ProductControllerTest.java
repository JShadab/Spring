package com.wipro.SpringWithMongo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.http.ResponseEntity;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import com.wipro.SpringWithMongo.controller.ProductController;
import com.wipro.SpringWithMongo.entity.Product;
import com.wipro.SpringWithMongo.service.ProductService;

@ExtendWith(MockitoExtension.class)
@RunWith(MockitoJUnitRunner.class)
class ProductControllerTest {

	@InjectMocks
	ProductController productController;

	@Mock
	ProductService productService;

	@Test
	void testGetAllProducts() {

		// given

		Product product1 = new Product("201", "Product-A", 10, "Category-1");
		Product product2 = new Product("202", "Product-B", 20, "Category-2");
		Product product3 = new Product("203", "Product-C", 30, "Category-3");

		List<Product> allProducts = Arrays.asList(product1, product2, product3);

		when(productService.getAllProducts()).thenReturn(allProducts);

		// when

		List<Product> productsFromController = productController.getAllProducts();

		// then

		assertFalse(productsFromController == null);
		assertEquals(3, productsFromController.size());
	}

	@Test
	void testGetProduct() {

		Product product = new Product("501", "Product-A", 10, "Category-1");

		Optional<Product> productOpt = Optional.of(product);

		when(productService.getProduct("501")).thenReturn(productOpt);

		Optional<Product> resultProductOpt = productController.getProduct("501");

		assertFalse(resultProductOpt.isEmpty());

	}

	@Test
	void testSaveProduct() {

		MockHttpServletRequest request = new MockHttpServletRequest();

		RequestContextHolder.setRequestAttributes(new ServletRequestAttributes(request));

		Product product = new Product("501", "Product-A", 10, "Category-1");

		ResponseEntity<String> response = productController.saveProduct(product);

		verify(productService).saveProduct(product);

		assertEquals(response.getStatusCodeValue(), 200);

	}
}
