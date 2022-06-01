package com.wipro.BEJ_C2_S1_REST_API_PC_11.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Movie {

	@Id
	private long id;
	
	private String name;
	private String origin;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getOrigin() {
		return origin;
	}

	public void setOrigin(String origin) {
		this.origin = origin;
	}

	@Override
	public String toString() {
		return "Movie [id=" + id + ", name=" + name + ", origin=" + origin + "]";
	}

}
