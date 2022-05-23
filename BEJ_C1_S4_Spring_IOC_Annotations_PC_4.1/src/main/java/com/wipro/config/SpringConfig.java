package com.wipro.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.wipro.model.Author;
import com.wipro.model.Book;

@Configuration
@ComponentScan(basePackages = "com.wipro")
public class SpringConfig {

	@Bean
	public Author getAuthor() {
		Author author = new Author();
		author.setName("Shad");
		
		return author;
	}
	@Bean(name = "book")
	public Book getBook() {
		Book book = new Book();
		book.setTitle("SCJP BY SAHADAb");
		book.setAuthor(getAuthor());
		
		return book;
	}
}
