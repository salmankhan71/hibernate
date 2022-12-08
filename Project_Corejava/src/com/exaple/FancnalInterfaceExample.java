package com.exaple;

interface Laptop {
	abstract void run();

	default void show() {
		System.out.println("default Method");
	}

	static void go() {
		System.out.println("static method called");
	}
}

public class FancnalInterfaceExample {

	public static void main(String[] args) {
		Laptop laptop = new Laptop() {
			
			@Override
			public void run() {
			System.out.println("run method call");	
				
			}
		};
		laptop.run();
		Laptop.go();
		Laptop la=()->System.out.println("run method");
		laptop.run();
		la.run();

	}

}
