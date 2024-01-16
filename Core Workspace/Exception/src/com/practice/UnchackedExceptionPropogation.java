package com.practice;

public class UnchackedExceptionPropogation {

	public static void main(String[] args) {

		dad();
	}

	private static void dad() {

		try {
			mom();

		} catch (RuntimeException e) {

			System.out.println("Caught by son , raised by Dad");
		}
	}

	private static void mom() {

		son();
	}

	private static void son() {

		throw new RuntimeException("I made mistake");
	}
}
