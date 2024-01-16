package com.string;

public class Ascii_No {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//ASCII == askai value
		//A-65 ,B-66 to Z-90
		//a-97 to z-122
        char a = 'r';
		
		int ascii = a;
		
		System.out.println("ascii = "+ ascii);
		System.out.println(" ");
	
		
		
		String name = "Krishna7";
		
		for (int i = 0; i < name.length(); i++) {
			
			char ch = name.charAt(i);
			
			System.out.print((int)ch + " ");
			
		}
	
	}

}
