package com.exception03;

public class CustomExceptionLogin {
	public static void main(String[] args) throws LoginException {
	  //String user = "Java";
		String user = null;
		if (user == null) {
			throw new LoginException();
		} else {
			System.out.println(user);
		}
	}
}
