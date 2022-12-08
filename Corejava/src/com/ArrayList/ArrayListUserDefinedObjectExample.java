package com.ArrayList;

import java.util.ArrayList;
import java.util.List;

import com.salman.Test;

class User{
	 private String name;
	    private int age;
		public User(String name, int age) {
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
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
		@Override
		public String toString() {
			return "User [name=" + name + ", age=" + age + "]";
		}
		
	    
}
public class ArrayListUserDefinedObjectExample {

	public static void main(String[] args) {
		List<User>users=new ArrayList<>();
		users.add(new User("salman", 25));
		users.add(new User("Kaleem", 27));
		users.add(new User("Imran", 28));
		
		users.forEach(a->{
			System.out.println("Name:"+a.getName()+",age:"+a.getAge());
		});
		
	}

}
