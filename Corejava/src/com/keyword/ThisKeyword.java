package com.keyword;

class Abrar {
	void show() {
		System.err.println("abrar khan java developer");
	}
     
	void display(int a) {
		this.show();
		System.err.println("salman khan");
	}
}

public class ThisKeyword {

	public static void main(String[] args) {

		Abrar a = new Abrar();
      a.display(2);
	}

}
