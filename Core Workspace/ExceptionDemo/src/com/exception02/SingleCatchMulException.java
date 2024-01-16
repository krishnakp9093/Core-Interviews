package com.exception02;

public class SingleCatchMulException {

	public static void main(String[] args) {
		
		String s = "Java";
		
		try {
			System.out.println(s.charAt(8));
		} catch (NullPointerException|StringIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		}
	}
}
