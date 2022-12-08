package com.hibernate1;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Emp<Project> {
	@Id
	private int id;
	private String name;
	@ManyToMany
	private List<Project> projects;
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
	public List<Project> getProjects() {
		return projects;
	}
	public void setProjects(List<Project> projects) {
		this.projects = projects;
	}
	public Emp(int id, String name, List<Project> projects) {
		super();
		this.id = id;
		this.name = name;
		this.projects = projects;
	}
	public Emp() {
		super();
		
	}

}
