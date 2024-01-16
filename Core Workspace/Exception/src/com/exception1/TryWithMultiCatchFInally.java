package com.exception1;

public class TryWithMultiCatchFInally {

	public static void main(String[] args) {

		String s = "vipin";

		try {
			System.out.println(s.length());
			System.out.println(s.charAt(10));
			
		} catch (NullPointerException e) {
			System.out.println(" ");
			
		} catch (StringIndexOutOfBoundsException e) {
			//System.exit(0);
			System.out.println(e.getMessage());
			
		} finally {
			System.out.println("it is finally block");
		}
	}
}
