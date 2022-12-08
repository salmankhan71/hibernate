package com.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class W {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("Aamir");
		list.add("sakib");
		list.add("Asad");
		list.add("salman");
System.out.println(list);
		Collections.addAll(list, "A", "B", "C", "D");
		System.out.println(list);
		list = List.of("E", "F", "G");
		 System.out.println(list);
		List<Integer> arrList = Arrays.asList(1, 2, 3, 4, 5, 6);
		 Iterator<Integer> iterator = arrList.iterator();
	     while (iterator.hasNext()) {
	    	 System.out.println(iterator.next());
	     }
		//System.out.println(arrList);
	//	System.out.println(arrList.addAll(5, arrList));
     Iterator<String> itr = list.iterator();
     while (itr.hasNext()) {
    	 System.out.println(itr.next());
    	 
		
	}
	}
}
