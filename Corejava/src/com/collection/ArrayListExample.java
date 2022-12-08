package com.collection;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
	public static void main(String[] args) {

		List<String> arrList = new ArrayList<String>();
		arrList.add("salman");
		arrList.add("kaleem");
		arrList.add("adil");
		arrList.add("kalam");
		arrList.add("sakib");
		arrList.add("imran");

		System.out.println(arrList);

		arrList.add(3, "gufran");

		System.out.println(arrList);
	}
}
