package com.wipro.model;

import org.springframework.stereotype.Component;

@Component(value = "intel")
public class IntelProcessor implements Processor {

	public void startProcess() {
		System.out.println("I am Intel");
		
	}

}
