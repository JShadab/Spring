package com.wipro;

public class Car {

	private String brand;

	void start() {

		System.out.println(brand + " Car is starting....");
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getBrand() {
		return brand;
	}

}
