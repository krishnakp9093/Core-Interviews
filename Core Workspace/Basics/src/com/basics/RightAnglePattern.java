package com.basics;

public class RightAnglePattern {

	public static void main(String[] args) {

		// right();
		left();

	}

	private static void left() {
		// TODO Auto-generated method stub
		for (int i = 0; i <= 5; i++) {
			for (int k = 5 - i; k >= 0; k--) {
				System.out.print(" ");
			}
			for (int j = i; j >= 0; j--) {
				System.out.print("*");
			}

			System.out.println();
		}

	}

	private static void right() {
		// TODO Auto-generated method stub

		for (int i = 0; i <= 5; i++) {

			for (int j = 1; j <= i; j++) {
				System.out.print(i + " ");
			}
			System.out.println();
		}

	}

}
