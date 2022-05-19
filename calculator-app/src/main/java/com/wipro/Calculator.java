package com.wipro;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class Calculator {
	public static void main(String[] args) {

		Calculator calculator = new Calculator();

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter First Number");
		int x = sc.nextInt();

		System.out.println("Enter Second Number");
		int y = sc.nextInt();

		System.out.println("Enter any operator among (+, -, *, /)");
		String operator = sc.next();

		switch (operator) {
		case "+": {
			int result = calculator.addition(x, y);
			System.out.println(result);
			break;
		}
		case "-": {
			int result = calculator.subtraction(x, y);
			System.out.println(result);
			break;
		}
		case "*": {
			int result = calculator.multiplication(x, y);
			System.out.println(result);
			break;
		}
		case "/": {
			int result = calculator.division(x, y);
			System.out.println(result);
			break;
		}

		default:
			System.out.println("Invald operator");
			break;
		}
	}

	public int addition(int a, int b) {
		return a + b;
	}

	public int subtraction(int a, int b) {
		return a - b;
	}

	public int multiplication(int a, int b) {
		return a * b;
	}

	public int division(int a, int b) {
		return a / b;
	}
}
