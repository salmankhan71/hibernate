package com.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListAddExample {
	public static void main(String[] args) {
		String arr[] = { "Blue", "Red", "Orange", "Green", "Yellow" };
		List<String> list = new ArrayList<>();
		for (int i = 0; i < 5; i++) {
			list.add(arr[i]);
			System.out.println(list + "Ayyay size " + list.size());
		}
		System.out.println("++++++++++++++++++++++++++++++++");
		list.forEach(a -> System.out.println(a));
		System.out.println(list.subList(1, 4));
		System.out.println("-----------------------------");
		Iterator<String> itr = list.iterator();
		while (itr.hasNext()) {
			System.out.println("colour list:" + itr.next());

		}
	}
}
