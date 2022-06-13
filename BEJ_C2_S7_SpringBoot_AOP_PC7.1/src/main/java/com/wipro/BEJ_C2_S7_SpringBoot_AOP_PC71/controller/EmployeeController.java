package com.wipro.BEJ_C2_S7_SpringBoot_AOP_PC71.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.wipro.BEJ_C2_S7_SpringBoot_AOP_PC71.model.Employee;
import com.wipro.BEJ_C2_S7_SpringBoot_AOP_PC71.service.EmployeeService;

@RestController
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;

	@RequestMapping(value = "/add/employee", method = RequestMethod.GET)
	public Employee addEmployee(@RequestParam("name") String name, @RequestParam("empId") String empId) {

		return employeeService.createEmployee(name, empId);

	}

	@RequestMapping(value = "/remove/employee", method = RequestMethod.GET)
	public String removeEmployee(@RequestParam("empId") String empId) {

		employeeService.deleteEmployee(empId);

		return "Employee removed";
	}

}
