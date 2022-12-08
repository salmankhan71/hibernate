package com.epm;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;


@Entity
class Employee1 {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
private Integer employeeId;
	@Column(name="employee_name",length = 100,nullable = false)
	private String employeeName;
	@Column(name="email",unique = true)
	private String email;
	@Column(name="date_of_joining")
	private Date dob;
	@Column(name="salary")
	private Double salary;
	@ManyToOne
	private Department department;
	public Employee1() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee1(Integer employeeId, String employeeName, String email, Date dob, Double salary,
			Department department) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.email = email;
		this.dob = dob;
		this.salary = salary;
		this.department = department;
	}
	public Integer getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(Integer employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public Double getSalary() {
		return salary;
	}
	public void setSalary(Double salary) {
		this.salary = salary;
	}
	public Department getDepartment() {
		return department;
	}
	public void setDepartment(Department department) {
		this.department = department;
	}
	@Override
	public String toString() {
		return "Employee1 [employeeId=" + employeeId + ", employeeName=" + employeeName + ", email=" + email + ", dob="
				+ dob + ", salary=" + salary + ", department=" + department + "]";
	}
	
	
	
		
	}
	
	
	
