package com.basics;

public class DigitReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num = 4567;
		int a = num;
		int rem;
		int rev = 0;
		while (a != 0) {
			rem = a % 10;
			rev = rev * 10 + rem;
			a = a / 10;
		}
		System.out.println(rev);
	}
}
