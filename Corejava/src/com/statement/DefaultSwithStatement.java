package com.statement;

public class DefaultSwithStatement {
	public static void main(String[] args) {
		int day=4;
		switch (day) {
		case 5:
			System.out.println("Today is the friday");
			break;
			case 6:
				System.out.println("Today is the sunday");
              break;
		default:
			System.out.println("Looking forward to the Weekend");
			break;
		}
	}
}
