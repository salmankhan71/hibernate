package com.patternPrint;

public class StarPrint {
	public  void StarRightTriangle() {
		int a, b;

		for (a = 0; a < 5; a++) {

			for (b = 0; b <= a; b++) {
				System.out.print("* ");
			}

			System.out.println();
		}
	}

	public static void main(String args[]) {
		StarPrint s=new StarPrint();
		s.StarRightTriangle();
	}
}
