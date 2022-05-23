package com.wipro;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.wipro.config.SpringConfig;
import com.wipro.model.Book;

public class Application {

	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);

		Book book = (Book) context.getBean("book");
		
		System.out.println(book);

	}

}
