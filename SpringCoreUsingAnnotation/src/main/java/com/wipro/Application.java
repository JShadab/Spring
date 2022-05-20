package com.wipro;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.wipro.config.SpringConfig;

public class Application {

	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);

		// Car car = new Car();

		Car car1 = (Car) context.getBean("car");
		car1.start();

//		Engine engine =  context.getBean(Engine.class);
//		engine.start();

//		Car car2 = (Car) context.getBean("car");
//		car2.start();
//		
//		System.out.println(car1 == car2);
	}

}
