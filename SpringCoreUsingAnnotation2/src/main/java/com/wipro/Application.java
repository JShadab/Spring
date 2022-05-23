package com.wipro;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.wipro.config.SpringConfig;
import com.wipro.model.Laptop;

public class Application {

	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);

		Laptop laptop1 = (Laptop) context.getBean("laptop");
		
		laptop1.boot();

	}

}
