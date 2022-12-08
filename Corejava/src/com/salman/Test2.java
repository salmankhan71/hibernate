package com.salman;

import java.util.ArrayList;
import java.util.Iterator;

public class Test2 {

	public static void main(String[] args) {
	ArrayList<String>list=new ArrayList<>();
	list.add("Salman");
	list.add("Noushad");
	list.add("Imran");
	list.add("Fasizan");
	Iterator<String> iterator = list.iterator();
    while(iterator.hasNext()) {
    	System.out.println(iterator.next());
    }
	}

}
