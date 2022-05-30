package com.wipro.SpringBootWithHibernate;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.wipro.SpringBootWithHibernate.model.Employee;
import com.wipro.SpringBootWithHibernate.repository.EmployeeRepository;

@SpringBootApplication
public class SpringBootWithHibernateApplication implements CommandLineRunner {

	@Autowired
	EmployeeRepository employeeRepository;

	public static void main(String[] args) {
		SpringApplication.run(SpringBootWithHibernateApplication.class, args);

		System.out.println("Spring Boot is Starting ......");
	}

	@Override
	public void run(String... args) throws Exception {

		System.out.println("In the Run method");

		// createData();
		retreiveData();
		// updateData();
		deleteData();
		retreiveData();

	}

	void createData() {

		Employee employee = new Employee();
		employee.setId(102); // New ID -> Insert
		employee.setUsername("Mahati");
		employee.setPasword("4321");

		employeeRepository.save(employee);
	}

	void retreiveData() {
		List<Employee> allEmps = employeeRepository.findAll();
		System.out.println(allEmps);
	}

	void updateData() {
		Employee employee = new Employee();

		employee.setId(102); // Existing ID -> Update
		employee.setUsername("Mahati");
		employee.setPasword("334455"); // Updated Password

		employeeRepository.save(employee);
	}

	void deleteData() {

		employeeRepository.deleteById(101L);
	}

}
