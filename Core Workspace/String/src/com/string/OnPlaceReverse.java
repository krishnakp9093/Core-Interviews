package com.string;

public class OnPlaceReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name = "Jay Shree Ram";

		String[] n = name.split(" ");

		// System.out.println(n);

		for (int i = 0; i < n.length; i++) {
			for (int j = n[i].length()-1; j >= 0; j--) {

				System.out.print(n[i].charAt(j));

			}

			System.out.print(" ");

		}

	}

}
