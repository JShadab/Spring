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

	public static String printFebonacci(int N) {

		int a = 0;
		int b = 1;
		
		if(N <=0) {
			
			return "Invalid input";
		}

		String series = "";

		if (N == 1) {
			series = "0";

		} else if (N == 2) {
			series = "0 1";
		} else {
			for (int i = 3; i <= N; i++) {
				int c = a + b;

				series = series + " " + c;

				a = b;
				b = c;
			}

			System.out.println(series);

		}
		return series;
	}
}
