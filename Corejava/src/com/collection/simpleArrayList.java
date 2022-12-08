package com.collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

public class simpleArrayList {

	public static void main(String[] args) {
		List<String>s=new ArrayList<>();
		s.add("Anas");
		s.add("kaleem");
		s.forEach(a->{
			System.err.println(a);
		});
	
System.out.println("------------------------------------------------------------");
	Map<String, Integer>map=new HashMap<>();
	map.put("Ayaz", 21);
	map.put("Abrar", 25);
	map.put("Tufail", 20);
	map.forEach((name,age)->System.out.println(name+"\t"+age));
	
	System.out.println("----------------------------------------------------------");
	Stream<String>stream=s.stream();
	stream.forEach(System.out::println);
	}
	
}

