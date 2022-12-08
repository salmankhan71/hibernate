package com.src;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tbl_student")
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int sid;
	@Column(name="fname")
	private  String sname;
	
	@Embedded
	StudentAddress address;
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public StudentAddress getAddress() {
		return address;
	}
	public void setAddress(StudentAddress address) {
		this.address = address;
	}
	public Student(int sid, String sname, StudentAddress address) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.address = address;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", address=" + address + "]";
	}
	
	
	
	

}
