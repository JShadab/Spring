package com.wipro.SpringBootWithHibernate.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wipro.SpringBootWithHibernate.model.Employee;

@Repository
public interface EmployeeRepository 

extends JpaRepository<Employee, Long> {

}
