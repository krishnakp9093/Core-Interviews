//WAP to count the character in string
package com.string;

public class OccurenceOfAnyOneLetterInString {
	public static void main(String[] args) {
		String name = "Neeraj";
		
		int j = 0;
		for(int i = 0; i<name.length(); i++) {
			char c = name.charAt(i);
			
			String k = name.valueOf(c);
			
			if(k.matches("e")) {
				j++;
			}
		}
		System.out.println(j);
	}
}
