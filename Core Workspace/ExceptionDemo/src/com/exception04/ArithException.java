package com.exception04;

public class ArithException {
	
	public static void main(String[] args) {
		
		int i=0;
		int j =15;
		try {
			int c = j/i;
			
			System.out.println(c);
		}catch(Exception e) {
	      e.printStackTrace();
	
		}
	}

}
