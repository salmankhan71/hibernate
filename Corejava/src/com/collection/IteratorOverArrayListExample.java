package com.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class IteratorOverArrayListExample {

	public static void main(String[] args) {
		List<String>list=new ArrayList<>();
		list.add("Breaking Bad");
		list.add("Game of Throne");
		list.add("Friends");
		list.add("Prisson break");
		Iterator<String> itr = list.iterator();
		itr.forEachRemaining(i-> System.out.println(i));
		System.out.println("----------------------------------");
		list.forEach(System.out::println);
		System.err.println("----------------=============-------");
		Stream<String>m2=list.stream();
		//m2.forEach(System.out::println);
		m2.forEachOrdered(System.out::println);
      	}

}
