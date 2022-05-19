package com.wipro;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

/**
 * Unit test for simple {@link Calculator}.
 */
@TestInstance(Lifecycle.PER_CLASS)
public class CalculatorTest {

	Calculator calculator;

	@BeforeAll
	public void setUp() {
		calculator = new Calculator();
	}

	@Test
	public void test_Addition() {

		int expected = 13;

		// Calculator calculator = new Calculator();

		int actual = calculator.addition(10, 3);

		assertEquals(expected, actual);
	}

	@Test
	public void test_Substraction() {

		int expected = 7;

		// Calculator calculator = new Calculator();

		int actual = calculator.subtraction(10, 3);

		assertEquals(expected, actual);
	}

	@Test
	public void test_Multiplication() {

		int expected = 30;

		// Calculator calculator = new Calculator();

		int actual = calculator.multiplication(10, 3);

		assertEquals(expected, actual);
	}

	@Test
	public void test_Division() {

		int expected = 3;

		// Calculator calculator = new Calculator();

		int actual = calculator.division(10, 3);

		assertEquals(expected, actual);
	}

}
