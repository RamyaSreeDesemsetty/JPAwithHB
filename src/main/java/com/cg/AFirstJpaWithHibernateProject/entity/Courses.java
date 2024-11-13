package com.cg.AFirstJpaWithHibernateProject.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Courses {
	@Id
	@GeneratedValue
	private long id;
	private String name;

	public Courses() {
		super();

	}

	public Courses(long id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

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

	@Override
	public String toString() {
		return "Courses [id=" + id + ", name=" + name + "]";
	}

}
