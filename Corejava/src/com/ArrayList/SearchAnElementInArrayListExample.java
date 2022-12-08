package com.ArrayList;

import java.util.ArrayList;

public class SearchAnElementInArrayListExample {

	

	public static void main(String[] args) {
		ArrayList ms = new ArrayList();
		ms.add("1");
		ms.add("2");
		ms.add("3");
		ms.add("4");
		ms.add("5");
		ms.add("1");
		ms.add("2");
		System.out.println(ms);

		boolean cont = ms.contains("2");
		System.out.println("Does arrayList contain 2 ? " + cont);

		int ind = ms.indexOf("4");
		if (ind == -1) {
			System.out.println("ArrayList does not contain 4");

		}
		else {
			System.out.println("ArrayList contains 4 at index :" + ind);
		}
		int lastIndexOf = ms.lastIndexOf("1");
		 
		if(lastIndexOf == -1)
		      System.out.println("ArrayList does not contain 1");
		    else
		      System.out.println("Last occurrence of 1 in ArrayList is at index :" + lastIndexOf);
		                                                              
	}

}
