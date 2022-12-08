package com.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class RemovingOddElement {

	public static void main(String[] args) {
		List<Integer>number=new ArrayList<>();
		Collections.addAll(number, 11,12,13,14,15,16,17,18,19,20);
		for (Integer i : number) {
			if (i%2 !=0) {
				System.out.println(i);
			}
		}
	}

}
