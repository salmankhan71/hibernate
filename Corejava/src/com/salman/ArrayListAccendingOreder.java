package com.salman;

public class ArrayListAccendingOreder {

	public static void main(String[] args) {
		int emp = 0;
		int ar[] = { 10, 2, 6, 16, 4, 7, 15 };//[2,4,6,7,10,15,16]
		for (int i = 0; i < ar.length; i++) {
			for (int j = i + 1; j < ar.length; j++) {
				if (ar[j] < ar[i]) {
					emp = ar[i];
					ar[i] = ar[j];
					ar[j] = emp;
				}
			}
		}
			System.out.println();
			for (int i = 0; i< ar.length; i++) {
				System.out.println(ar[i] + " ");
			}

		
	}

}
