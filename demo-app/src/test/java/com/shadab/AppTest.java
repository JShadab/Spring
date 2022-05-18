package com.shadab;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {
	@Test
	public void test_printFebonaci() {

		String expected = "0 1 1 2 3 5 8 13 21 34";
		int N = 10;

		String actual = App.printFebonacci(N);

		assertEquals(expected, actual);
	}

	@Test
	public void test_printFebonaci_WithSizeOne() {

		String expected = "0";
		int N = 1;

		String actual = App.printFebonacci(N);

		assertEquals(expected, actual);
	}

	@Test
	public void test_printFebonaci_WithSizeTwo() {

		String expected = "0 1";
		int N = 2;

		String actual = App.printFebonacci(N);

		assertEquals(expected, actual);
	}

	@Test
	public void test_printFebonaci_WithSizeZero() {

		String expected = "Invalid input";
		int N = 0;

		String actual = App.printFebonacci(N);

		assertEquals(expected, actual);
	}
}
