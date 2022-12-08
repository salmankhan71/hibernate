package com.ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.collection.ArrayListAddExample;

class Person{
	private String name;
	private Integer age;
	public Person(String name, Integer age) {
		super();
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	
}
public class ArrayListObjectSortExample {

	
	public static void main(String[] args) {
		List<Person>list=new ArrayList<>();
		list.add(new Person("Salman", 25));
		list.add(new Person("Kaleem", 27));
		list.add(new Person("Imran", 28));
		System.out.println("Person List"+list);
		
		// Sort People by their Age
		
		list.sort((Person1,Person2)->{
			return Person1.getAge()-Person2.getAge();
		});
		// A more concise way of writing the above sorting function
		list.sort(Comparator.comparingInt(Person::getAge));
		System.out.println("Sorted Person List by Age : " +list);
		
        // You can also sort using Collections.sort() method by passing the custom Comparator
		Collections.sort(list,Comparator.comparing(Person::getName));
		System.out.println("Sorted Person List by Name : " +list);
	}

}
