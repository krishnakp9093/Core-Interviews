package com.exersice4_14;

public class Q04_Factorial {
	public static void main(String[] args) {

		int num = 6;
		int u = 1;
		for (int i = 1; i <= num; i++) {
			u = u * i;

		}
		System.out.println("factorial of given number is = " + u);
	}
}
