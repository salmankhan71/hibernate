package com.salman;

public class StudentClass {
	String name;
	int id;

	public StudentClass(String n, int i) {
		this.name = n;
		this.id = i;

	}
	void display() {
		System.out.println(name+" "+id);
	}

public static void main(String args[]) {
Agrigation obj=new Agrigation("Salman", 24, "bhatpara");
StudentClass studentClass=new StudentClass("Imran khan", 30);
obj.printShow();
studentClass.display();
//obj.printShow();
}
}