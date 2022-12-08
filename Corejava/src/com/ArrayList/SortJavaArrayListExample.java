package com.ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class SortJavaArrayListExample {

	public static void main(String[] args) {
		ArrayList List = new ArrayList();

		// Add elements to Arraylist
		List.add("1");
		List.add("3");
		List.add("5");
		List.add("2");
		List.add("4");

		
		Collections.sort(List);
		System.out.println("ArrayList elements after sorting in ascending order : ");
	    for(int i=0; i<List.size(); i++)
	      System.out.println(List.get(i));
	 
	}

}
