package com.example;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Orang {
	@Id
private int id;
private String name;
private String college;
public Orang() {

}
public Orang(int id, String name, String college) {
	super();
	this.id = id;
	this.name = name;
	this.college = college;
}
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
	return "Orang [id=" + id + ", name=" + name + ", college=" + college + "]";
}

}
