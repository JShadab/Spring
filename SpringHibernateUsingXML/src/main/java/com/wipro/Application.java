package com.wipro;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.wipro.entity.dao.EmployeeDao;

public class Application {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
		
	EmployeeDao employeeDao=	(EmployeeDao) context.getBean("empDao");
	
	employeeDao.getOne(1);

		
	}

}
