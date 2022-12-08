package com.salman;

import java.util.Scanner;

public class CustemTest {

	public static void main(String[] args) throws CustomException {
		System.out.println("Please Enter Withdraw Money:");
		Scanner sc=new Scanner(System.in);
		int amount=sc.nextInt();
		if (amount>10000) {
			throw new CustomException("You are trying to withdraw more than the daily limit,please check before the Withdraw");
		}
		else {
			System.out.println("You withdraw your mony susscessfully....Enjoy the dad:-");
		}
	}

}
class DailyLimitExecption extends Throwable{
	 DailyLimitExecption(String str){
		 super(str);
	 }
	 }
