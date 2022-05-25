package com.wipro.entity;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("employeeDao")
public class EmployeeDao {

	@Autowired
	private SessionFactory sessionFactory;

	private Session session;

	protected Session getSession() {
		if (session == null) {
			session = sessionFactory.openSession();
		}
		return session;
	}

	public void persist(Object entity) {

	}

	public void delete(Object entity) {
		getSession().delete(entity);
	}

	public void saveEmployee(Employee employee) {
		getSession().save(employee);
		getSession().flush();
	}

	@SuppressWarnings("unchecked")
	public List<Employee> findAllEmployees() {
		Criteria criteria = getSession().createCriteria(Employee.class);
		return (List<Employee>) criteria.list();
	}

	public void deleteEmployeeBySsn(String email) {
		Query query = getSession().createSQLQuery("delete from Employee where email = :email");
		query.setString("email", email);
		query.executeUpdate();
	}

	public Employee findByEmail(String email) {
		Criteria criteria = getSession().createCriteria(Employee.class);
		criteria.add(Restrictions.eq("email", email));
		return (Employee) criteria.uniqueResult();
	}

	public List<Employee> findAll() {
		return getSession().createQuery("SELECT a FROM Employee a").list();

	}

	public void updateEmployee(Employee employee) {
		getSession().update(employee);
	}

}