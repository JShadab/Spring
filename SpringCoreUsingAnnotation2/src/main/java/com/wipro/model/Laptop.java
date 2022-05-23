package com.wipro.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Laptop {

	private String brand;

	//Field level Dependency Injection
	@Autowired
	@Qualifier("amd")
	private Processor processor;

	public void boot() {
		processor.startProcess();
	}

}
