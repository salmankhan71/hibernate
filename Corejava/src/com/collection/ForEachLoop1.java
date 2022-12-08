package com.collection;

import java.util.ArrayList;
import java.util.List;

public class ForEachLoop1 {
	public static void main(String args[]) {
		List<String> alist = new ArrayList<String>();
		alist.add("Gregor Clegane");
		alist.add("Khal Drogo");
		alist.add("Cersei Lannister");
		alist.add("Sandor Clegane");
		alist.add("Tyrion Lannister");

		for (String str : alist)
			System.out.println(str);
	}
}