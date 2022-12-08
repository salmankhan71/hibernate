package com.patternPrint;

import java.util.Scanner;

public class PrimeNotPrimeExample {

	public static void main(String[] args) {
		System.out.println("Enter the details..........");
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		if (isPrime(t)) {
			System.out.println(t +":"+ "prime Number\n");
		} else {
			System.out.println(t +":"+ "not Prime Number\n");
		}
	}

	static boolean isPrime(int t) {
		if (t<=1) {
			return false;
		}
		for (int i = 2; i <=t/2 ;i++) {
			if ((t%i)==0) {
				return false;
			}
		}
		return true;
	}

}
