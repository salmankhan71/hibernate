package com.salman;

class Car {

	String model;
	String color;

	Car(String carModel, String carColor) {
		model = carModel;
		color = carColor;
	}

	
	void startEngine() {
		System.out.println("Engine started");
	}

	void stopEngine() {
		System.out.println("Engine stopped");
	}

	void openWindow() {
		System.out.println("Window opened");
	}

	void closeWindow() {
		System.out.println("Window closed");
	}
}

public class ClassObject {

	public static void main(String[] args) {

		Car marutiBaleno = new Car("MarutiBaleno", "red");
		System.out.println("Color is " + marutiBaleno.color);

		marutiBaleno.startEngine();
	}
}
