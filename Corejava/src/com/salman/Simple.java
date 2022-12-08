package com.salman;

public class Simple {

	public void test(Integer i) {
		System.out.println("Method ==> test(Integer)");
	}

	public void show(String name) {
		System.out.println("Method ==> test(String) ");
	}

	public static void main(String[] args) {
		Simple obj = new Simple();
		Integer a = null;
		obj.test(a);
		String b = null;
		obj.show(b);
	}

}
