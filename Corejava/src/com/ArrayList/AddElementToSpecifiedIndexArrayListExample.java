package com.ArrayList;

import java.util.ArrayList;
import java.util.List;

public class AddElementToSpecifiedIndexArrayListExample {

	public static void main(String[] args) {
		List<String> aList=new ArrayList<String>();
		aList.add("1");
		aList.add("2");
		aList.add("3");
		System.err.println(aList);
		
		aList.add(1, "INSERT eLEMENT");
		
		System.out.println("ArrayList contains...");
		
		for (int i = 0; i < aList.size(); i++) {
			System.out.println(i);
			
		}

	}

}
