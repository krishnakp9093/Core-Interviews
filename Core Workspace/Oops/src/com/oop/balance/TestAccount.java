package com.oop.balance;

public class TestAccount {
	public static void main(String[] args) {
		int balance = 10000;
		try {

			if (balance > 2000) {
				throw new InsufficientFunds();
			}
			int a = 10;
			int b = 0;
			int c = a / b;
		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.getStackTrace();
		}
	}
}
