package com.string;

public class ExtractPerticular {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String [] str = {"java.exe" ,"java.exe" ,"tpoint.txt" ,"java.exe" ,"java.txt"};

		for (int i = 0; i < str.length; i++) {
			
			if(str[i].contains(".exe")) {
				System.out.println(str[i]);
			}
		}
	}
}
