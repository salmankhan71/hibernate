package com.imran;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class FirstClass {
	@Id
	private int id;
	private String name;
	private String college;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCollege() {
		return college;
	}

	public void setCollege(String college) {
		this.college = college;
	}

	@Override
	public String toString() {
		return "FirstClass [id=" + id + ", name=" + name + ", college=" + college + "]";
	}

}
