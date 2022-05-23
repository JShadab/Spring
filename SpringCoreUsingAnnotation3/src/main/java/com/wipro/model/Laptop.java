package com.wipro.model;

public class Laptop {

	private String brand;

	private Processor processor;

	public void boot() {
		processor.startProcess();
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public void setProcessor(Processor processor) {
		this.processor = processor;
	}

	public Processor getProcessor() {
		return processor;
	}

}
