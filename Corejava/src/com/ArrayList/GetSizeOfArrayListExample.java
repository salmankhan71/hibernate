package com.ArrayList;

import java.util.ArrayList;
import java.util.List;

public class GetSizeOfArrayListExample {

	public static void main(String[] args) {
		List<String> s=new ArrayList<String>();
		s.add("1");
		s.add("2");
		s.add("3");
		
		int totalElements  = s.size();
		
	    System.out.println("ArrayList contains...");
     
	    for (int i = 0; i < totalElements; i++) {
	    	System.out.println(s.get(i));
			
		}
	}

}
