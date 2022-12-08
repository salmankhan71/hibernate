package com.salman;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Employee {
	@Id
	int id;
	String firrstName;
	String lastName;

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(int id, String firrstName, String lastName) {
		super();
		this.id = id;
		this.firrstName = firrstName;
		this.lastName = lastName;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirrstName() {
		return firrstName;
	}

	public void setFirrstName(String firrstName) {
		this.firrstName = firrstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", firrstName=" + firrstName + ", lastName=" + lastName + "]";
	}

}
