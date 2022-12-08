package com.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ShortMethod {
	 public static void main(String[] args) {
	      List<String> fruits = new ArrayList<String>();
	      fruits.add("Orange");
	      fruits.add("Apple");
	      fruits.add("Banana");
	      fruits.add("Pineapple");
	      Collections.sort(fruits);

	      for (String str : fruits) {
	         System.out.println(str);
	      }
	   }
}
