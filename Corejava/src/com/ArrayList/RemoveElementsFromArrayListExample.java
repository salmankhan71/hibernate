package com.ArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class RemoveElementsFromArrayListExample {

	public static void main(String[] args) {
		List<String> program = new ArrayList<>();
		program.add("C");
		program.add("C++");
		program.add("Java");
		program.add("Kotlin");
		program.add("Python");
		program.add("Perl");
		program.add("Ruby");

		System.out.println("Initial List: " + program);

		// Remove the element at index `5`
		program.remove(5);
		System.out.println("After remove(5): " + program);
		boolean isRemove = program.remove("Kotlin");
		System.out.println("After remove(\"Kotlin\"): " + program);
		System.out.println(isRemove);

		List<String> scriptingLanguages = new ArrayList<>();
		scriptingLanguages.add("Python");
		scriptingLanguages.add("Ruby");
		scriptingLanguages.add("Perl");

		scriptingLanguages.removeAll(scriptingLanguages);
		System.out.println("After removeAll(scriptingLanguages): " + program);

		// Remove all the elements that satisfy the given predicate
		
		  
		/*
		 * program.removeIf(new Predicate<String>() {
		 * 
		 * @Override public boolean test(String t) {
		 * 
		 * return t.startsWith("c"); } });
		 */
		 
		 program.removeIf(new Predicate<String>() {
	            @Override
	            public boolean test(String s) {
	                return s.startsWith("C");
	            }
	        });
			 
		 

		System.out.println("After Removing all elements that start with \"C\": " + program);

	}

}
