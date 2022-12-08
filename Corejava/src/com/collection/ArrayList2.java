package com.collection;

import java.util.ArrayList;
import java.util.List;

public class ArrayList2 {
	 public static void main(String[] args) {
	      List<String> names = new ArrayList<String>();
	      names.add("Jim");
	      names.add("Jack");
	      names.add("Ajeet");
	      names.add("Chaitanya");
	      names.set(0, "Lucy");
	      System.out.println(names);
	   }
}
