package com.salman;
class Throw {
	int a = 10;
	int b = 5;
	void divide() {
		if (b == 5) {
			throw new ArithmeticException();
		}
		else {
			int res = a / b;
			System.out.println(res);
		}
	}
}
public class ThrowKeywordExample {
	public static void main(String[] args) {
		Throw t = new Throw();
		try {
			t.divide();
		} catch (Exception e) {
			e.printStackTrace();
		}
     System.out.println("rest of the code");
	}

}
