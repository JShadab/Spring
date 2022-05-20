package com.wipro;

public class Car {

	private String brand;
	private Engine engine;

	void start() {

		System.out.println(brand + " Car is starting....");

		engine.start();
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getBrand() {
		return brand;
	}

	public Engine getEngine() {
		return engine;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}

}
