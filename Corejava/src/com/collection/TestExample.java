package com.collection;

import java.util.ArrayList;
import java.util.List;

public class TestExample {

	
	public static <T> void main(String[] args) {
		List<String>al=new ArrayList<>();
     al.add("salman");
     al.add("Imran");
     al.add("gufran");
     al.add("kaleem");
     al.add("mujib");
     al.add("Ayan");
   al.forEach(System.out::println);//lemda expression
    

}
}