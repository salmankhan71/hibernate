package com.keyword;

class Abcd
{
	void m1()
	{
		System.err.println("hello abcd");
	}
}
class Abb extends Abcd
{
	

	void m2()
	{
		super.m1();
	}
}

public class SuperKeyword {

	public static void main(String[] args) {
		Abb sp= new Abb();
		sp.m2();

	}

}
