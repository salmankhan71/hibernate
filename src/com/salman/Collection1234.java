package com.salman;

import java.util.LinkedHashMap;
import java.util.Map;

public class Collection1234 {

	public static void main(String[] args) {
		Map<String,String>map=new LinkedHashMap<>();
   map.put("Gufran", "Khan");
   map.put("Imran", "Khan");
   map.put("Salman", "Khan");
   map.put("Kaleem", "Siddique");
   map.put("Mujeeb", "Siddique");
   map.put("Salam", "Khan");
   for(Map.Entry<String, String> m:map.entrySet()) {
	   System.out.println(m.getValue());
   }
	}

}
