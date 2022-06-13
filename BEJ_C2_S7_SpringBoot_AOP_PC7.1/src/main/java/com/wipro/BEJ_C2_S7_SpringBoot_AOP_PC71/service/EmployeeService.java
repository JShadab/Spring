package com.wipro.BEJ_C2_S7_SpringBoot_AOP_PC71.service;

import org.springframework.stereotype.Service;

import com.wipro.BEJ_C2_S7_SpringBoot_AOP_PC71.model.Employee;

@Service
public class EmployeeService {

	public Employee createEmployee(String name, String empId) {

		Employee emp = new Employee();
		emp.setName(name);
		emp.setEmpId(empId);
		return emp;
	}

	public void deleteEmployee(String empId) {

		int id = Integer.parseInt(empId);

	}
}