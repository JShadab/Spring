package com.wipro.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.wipro.model.IntelProcessor;
import com.wipro.model.Laptop;
import com.wipro.model.Processor;

@Configuration
@ComponentScan(basePackages = "com.wipro")
public class SpringConfig {

	@Bean
	Laptop getLaptop() {
		Laptop laptop = new Laptop();

		laptop.setBrand("HP");
		laptop.setProcessor(getProcessor());

		return laptop;

	}

	@Bean
	public Processor getProcessor() {

		return new IntelProcessor();
	}

}
