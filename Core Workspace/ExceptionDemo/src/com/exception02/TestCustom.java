package com.exception02;

public class TestCustom {

	public static void main(String[] args) {

		dad();
	}

	static void dad() {

		try {
			mom();
		} catch (CheckedCustomExcep e) {
			System.out.println(e.getMessage());
		}
	}

	static void mom() throws CheckedCustomExcep{
		son();

	}

	static void son() throws CheckedCustomExcep {

		throw new CheckedCustomExcep();
	}
}
