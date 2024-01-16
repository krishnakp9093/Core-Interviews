package com.exersice4_14;

public class Q07_SumOfAllInt {
	public static void main(String[] args) {

		int num = 7;
		int count = 0;
		int sum = 0;
		for (int i = 100; i <= 200; i++) {
			if (i % num == 0) {
				count = i;
				System.out.println(count);
				sum = sum + count;

			}

		}

		System.out.println("sum = " + sum);
	}
}
