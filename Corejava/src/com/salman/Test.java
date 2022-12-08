package com.salman;

public class Test {

	public static void main(String[] args) {
	UserBean user=new UserBean();
	user.setUserId("SA12345");
	user.setUsername("SALMAN KHAN");
	
	String userId = user.getUserId();
	System.out.println(userId);
	System.out.println(user);

	}

}
