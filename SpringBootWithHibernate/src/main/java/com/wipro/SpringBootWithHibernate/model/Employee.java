package com.wipro.SpringBootWithHibernate.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Employee {

	@Id
	private long id;

	private String username;
	private String pasword;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPasword() {
		return pasword;
	}

	public void setPasword(String pasword) {
		this.pasword = pasword;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", username=" + username + ", pasword=" + pasword + "]";
	}

}
