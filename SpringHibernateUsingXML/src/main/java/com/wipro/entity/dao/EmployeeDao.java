package com.wipro.entity.dao;

import java.util.List;

import org.hibernate.SessionFactory;

import com.wipro.entity.Employee;


public class EmployeeDao {

	
	private SessionFactory sessionFactory;

	public EmployeeDao(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public void insert(Employee employee) {

	}

	public void update(Employee employee) {
	}

	public void delete(int id) {
	}

	public Employee getOne(int id) {
		
		Employee listUser = (Employee) sessionFactory.getCurrentSession().get(Employee.class, id);
		return listUser;
	}

	public List<Employee> getAll() {
		return null;
	}

}
