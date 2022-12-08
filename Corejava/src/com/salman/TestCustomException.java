package com.salman;

public class TestCustomException {

	public static void main(String[] args) {
		try {
			throw new CustomException("Due to Invalid Value");
		} catch (Exception e) {
			System.out.println(e);
		}
    System.out.println("rest of the code");
	}

}
