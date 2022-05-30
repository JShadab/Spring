package com.wipro.BEJ_C1_S8_Spring_Boot_PC_81;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.wipro.BEJ_C1_S8_Spring_Boot_PC_81.service.GreetService;

@SpringBootApplication
public class Application implements CommandLineRunner{

	@Autowired
	private GreetService greetService;

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);

	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println(greetService.greet());
		
	}

}
