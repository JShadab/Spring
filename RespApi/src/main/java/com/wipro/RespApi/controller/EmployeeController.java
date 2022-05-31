package com.wipro.RespApi.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.wipro.RespApi.model.Employee;

@RestController
public class EmployeeController {

	private List<Employee> allEmployees;

	public EmployeeController() {
		allEmployees = new ArrayList<Employee>();
	}

	@GetMapping("/employee")
	public List<Employee> getAllEmployee() {
		return allEmployees;
	}

	@GetMapping("/employee/{id}")
	public Employee getEmployee(@PathVariable int id) {

		Employee employee = null;
		for (Employee emp : allEmployees) {

			if (emp.getId() == id) {

				employee = emp;
				break;
			}

		}
		return employee;
	}

	@PostMapping("/employee")
	public void addEmployee(@RequestBody Employee employee) {
		allEmployees.add(employee);
	}

	@PutMapping("/employee")
	public void updateEmployee(@RequestBody Employee updateEmployee) {

		for (Employee emp : allEmployees) {

			if (emp.getId() == updateEmployee.getId()) {

				emp.setEmail(updateEmployee.getEmail());
				emp.setName(updateEmployee.getName());
				emp.setPhone(updateEmployee.getPhone());
				break;
			}

		}

	}

	@DeleteMapping("/employee/{id}")
	public void deleteEmployee(@PathVariable int id) {

		int index = -1;
		int count = 0;
		for (Employee emp : allEmployees) {

			if (emp.getId() == id) {
				index = count;
				break;
			}

			count++;
		}

		if (index != -1) {
			allEmployees.remove(index);
		}

	}
}
