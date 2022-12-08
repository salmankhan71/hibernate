package com.patternPrint;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EvenOdd {
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int number;
		System.out.print("Enter the value of number\n: ");
		number = Integer.parseInt(in.readLine());
		if (number % 2 == 0)
			System.out.println("The number is even");
		else
			System.out.println("The number is odd");
		in.close();
	}
}