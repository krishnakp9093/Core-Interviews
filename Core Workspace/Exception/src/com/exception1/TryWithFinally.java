package com.exception1;

public class TryWithFinally {

	public static void main(String[] args) {
		
		String s = "vishu";
		try {
			
			s.charAt(9);
			System.out.println("mjmjmjj");
	//		System.exit(0);
		} finally  {
	System.out.println("end of program");
		}
		
	}
}
