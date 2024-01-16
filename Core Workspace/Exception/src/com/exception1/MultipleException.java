package com.exception1;

public class MultipleException {

	public static void main(String[] args) {

		String name = "vipin";

		try {
			System.out.println(name.length());

			System.out.println(name.charAt(6));

		} catch (NullPointerException e) {
			System.out.println("name can't be null");
		} catch (StringIndexOutOfBoundsException e) {
			System.out.println("String is small");

		}

	}

}
