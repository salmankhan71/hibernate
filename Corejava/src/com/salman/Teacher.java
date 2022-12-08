package com.salman;

public class Teacher {
	private int age;
	private String college;
	private int rollnumber;
	Student student;

	public Teacher(int age, String college, int rollnumber, Student student) {
		super();
		this.age = age;
		this.college = college;
		this.rollnumber = rollnumber;
		this.student = student;
	}

	void show() {
		System.out.println(age + " " + college + " " + rollnumber);
		System.out.println(student.studentId + " " + student.name + " " + student.city);
	}

	public static void main(String[] args) {
		Student student2 = new Student(101, "Salman", "Bhatpara");
        Teacher teacher = new Teacher(24, "SMBC", 2410580, student2);
        teacher.show();
	}

}
