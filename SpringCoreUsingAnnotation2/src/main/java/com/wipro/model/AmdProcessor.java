package com.wipro.model;

import org.springframework.stereotype.Component;

@Component(value = "amd")
public class AmdProcessor implements Processor {

	public void startProcess() {
		System.out.println("I am AMD");
		
	}

}
