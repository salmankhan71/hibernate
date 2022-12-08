package com.ArrayList;

import java.util.ArrayList;

public class AccessElementsFromArrayListExample {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		System.out.println("Is the topCompanies list empty? : " + list.isEmpty());
		list.add("Google");
		list.add("Apple");
		list.add("Microsoft");
		list.add("Amozan");
		list.add("Facebook");

		System.out.println("Here are the top " + list.size());
		System.out.println(list);
		
		// Retrieve the element at a given index
		
		String firtcompany = list.get(0);
		String secondcompany = list.get(1);
		String lastcompany = list.get(list.size() - 1);
		
		System.out.println("Best Company: " + firtcompany);
		System.out.println("Second Best Company: " + secondcompany);
		System.out.println("Last Company in the list: " + lastcompany);
		
		 // Modify the element at a given index
		list.set(4, "Walmart");
		System.out.println("Modified top companies list: " +list);
	}

}
