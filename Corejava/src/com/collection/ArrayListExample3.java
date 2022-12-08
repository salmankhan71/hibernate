package com.collection;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample3 {
	public static void main(String args[]) {
		List<String> alist = new ArrayList<String>();
		alist.add("Steve");
		alist.add("Tim");
		alist.add("Lucy");
		alist.add("Pat");
		alist.add("Angela");
		alist.add("Tom");

		System.out.println(alist);

		alist.remove("Steve");
		alist.remove("Angela");

		System.out.println(alist);

		alist.remove(2);

		System.out.println(alist);
	}
}
