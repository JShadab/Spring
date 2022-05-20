package com.wipro.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.wipro.Car;
import com.wipro.Engine;

@Configuration
public class SpringConfig {

	@Bean(name = "car")
	public Car getCar() {

		Car car = new Car();
		car.setBrand("JEEP");

		car.setEngine(getEngine());

		return car;

	}

	@Bean(name = "engine")
	public Engine getEngine() {

		Engine engine = new Engine();
		return engine;

	}

}
