package com.basics;

public class Highest2nd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a = { 10, 2, 5, 9 };
		int b = 0;
		int c = 0;

		for (int i = 0; i < a.length; i++) {

			if (b < a[i]) {

				c = b;
				b = a[i];

			}

			if (c < a[i] && b > a[i]) {
				c = a[i];
			}

		}
		System.out.println("Highest = " + b);

		System.out.println("second hightest = " + c);

	}

}
