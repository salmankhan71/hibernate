package com.patternPrint;

public class TestPattern {

	public static void main(String[] args) {

		int number = 7;

		int m = number;
		int n;

		do {
			n = 0;
			do {

				System.out.print(" ");

			} while (n++ < number - m);

			n = 0;

			do {

				System.out.print("*");
			}

			while (n++ < m * 2 - 2);

			System.out.println("");

		}

		while (--m > 0);

		m = 1;

		do {
			n = 0;

			do {

				System.out.print(" ");

			} while (n++ < (number - m));

			n = 0;

			do {

				System.out.print("*");
			}

			while (n++ < (m * 2) - 2);

			System.out.println("");

		}

		while (++m <= number);
	}
}
