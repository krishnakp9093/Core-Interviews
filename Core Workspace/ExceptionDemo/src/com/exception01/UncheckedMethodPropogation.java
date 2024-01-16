package com.exception01;

public class UncheckedMethodPropogation {

	public static void main(String[] args) {

		dad();

	}

	public static void dad() {

		try {
			mom();
		} catch (RuntimeException e) {
			System.out.println("Caught by dad , raised by mom");
		}

	}

	public static void mom() {
		son();
	}

	public static void son() {
		RuntimeException e = new RuntimeException();
		throw e;

	}

}
