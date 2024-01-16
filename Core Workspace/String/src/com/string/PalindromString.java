package com.string;

public class PalindromString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name = "Nayan";
		String rev = "";

		for (int i = name.length() - 1; i >= 0; i--) {

			rev = rev + name.charAt(i);

			/*
			 * char c = name.charAt(i); rev = rev + rev.valueOf(c); System.out.println(rev);
			 */
		}

		System.out.println(rev);

		if (name.equalsIgnoreCase(rev)) {
			System.out.println(rev + "  is a palindrome number");

		} else {

			System.out.println(rev + "  is not a palindrome number");

		}

	}

}
