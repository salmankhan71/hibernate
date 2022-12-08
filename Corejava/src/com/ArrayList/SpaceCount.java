package com.ArrayList;

import java.util.Scanner;

public class SpaceCount {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any String");
		String str;
		int space = 0;
		str = sc.nextLine();
		char ch[] = str.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			if (ch[i] == ' ') {
				space++;
			}
			System.out.println( space);
		}

	}

}
