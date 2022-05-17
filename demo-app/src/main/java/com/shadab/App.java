package com.shadab;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter count");

		int N = sc.nextInt();

		printFebonacci(N);
	}

	private static void printFebonacci(int N) {

		int a = 0;
		int b = 1;

		System.out.println(a);
		System.out.println(b);

		for (int i = 3; i <= N; i++) {
			int c = a + b;

			System.out.println(c);

			a = b;
			b = c;
		}

	}
}
