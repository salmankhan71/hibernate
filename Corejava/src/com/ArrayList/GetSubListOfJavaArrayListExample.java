package com.ArrayList;

import java.util.ArrayList;
import java.util.List;

public class GetSubListOfJavaArrayListExample {

	public static void main(String[] args) {
		ArrayList arrayList = new ArrayList();

		// Add elements to Arraylist
		arrayList.add("1");
		arrayList.add("2");
		arrayList.add("3");
		arrayList.add("4");
		arrayList.add("5");

		List subList = arrayList.subList(1, 3);
		// display elements of sub list.
		System.out.println("Sub list contains : ");

		for (int i = 0; i < subList.size(); i++) {
			System.out.println(subList.get(i));
			Object obj = subList.remove(0);
			System.out.println(obj + " is removed from sub list");

			System.out.println("After removing " + obj + " from sub list, original ArrayList contains : ");
		}
		for(int i=0; i< arrayList.size() ; i++)
		      System.out.println(arrayList.get(i));
		   
	}

}
