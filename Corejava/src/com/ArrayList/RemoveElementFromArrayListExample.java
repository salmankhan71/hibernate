package com.ArrayList;

import java.util.ArrayList;

public class RemoveElementFromArrayListExample {

	public static void main(String[] args) {
		ArrayList List = new ArrayList();
		   
	    //Add elements to Arraylist
		List.add("1");
		List.add("2");
		List.add("3");
	   
	   
	    
	    Object obj = List.remove(1);
	    System.out.println(obj + " is removed from ArrayList");
	   
	    System.out.println("ArrayList contains...");
	    //display elements of ArrayList
	    for(int i=0; i < List.size(); i++)
	      System.out.println(List.get(i));
	   
	  }

	}


