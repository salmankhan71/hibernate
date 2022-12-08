package com.salman;

public class CustomException extends Exception {
	String str;

	public CustomException(String str) {
		this.str = str;
	}

	public String toString() {
		return ("message=" + str);
	}

}
