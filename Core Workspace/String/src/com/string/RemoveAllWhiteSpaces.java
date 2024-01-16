package com.string;

public class RemoveAllWhiteSpaces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "   krish  naa ";
		String name = str.replaceAll("\\s", "");

		System.out.println(name);

	}

}
