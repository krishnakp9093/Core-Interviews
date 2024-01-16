package com.rays.demo;

import java.util.Scanner;

public class ScaanerClassExample {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// Integer
		/*
		 * int a; System.out.println("Please Enter any Number...."); a = sc.nextInt();
		 * System.out.println("Entered data is = " + a);
		 */

		// float
		/* f */

		// double
//		double a;
//		System.out.println("Please Enter any Double Number....");
//		a = sc.nextDouble();
//		System.out.println("Entered data is = " + a);

		// String

		String a;
		System.out.println("Please Enter any String Number....");
		a = sc.nextLine();
		System.out.println("Entered data is = " + a);

		// String without space
		/*
		 * String b; System.out.println("Please Enter any String Number...."); b =
		 * sc.next(); System.out.println("Entered data is = " + b);
		 */
	}
}
