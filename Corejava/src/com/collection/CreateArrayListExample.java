package com.collection;

import java.util.ArrayList;
import java.util.List;

public class CreateArrayListExample {

	public static void main(String[] args) {
		// Creating an ArrayList of String
		List<String> list = new ArrayList<>();
		list.add("lion");
		list.add("tiger");
		list.add("cat");
		list.add("dog");

		System.out.println(list);
		// Adding an element at a particular index in an ArrayList
		list.add(2, "Elephant");
		System.out.println(list);

	}

}
