package com.exception01;

public class TryWithFinally {

	public static void main(String[] args) {

		String s = "vishu";
		try {

			s.charAt(3);
			System.out.println("try");
			System.exit(0);
		} finally {
			System.out.println("end of program");
		}

	}
}
