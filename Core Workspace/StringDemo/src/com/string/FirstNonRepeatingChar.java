package com.string;

public class FirstNonRepeatingChar {
	public static void main(String[] args) {
		String str = "AABBCDE";
		
		char ch[] = str.toCharArray();
		for(int i=0; i<ch.length; i++) {
			boolean unique = true;
			for(int j =0; j<ch.length; j++) {
				if(i!=j && ch[i] == ch[j]) {
					unique = false;
				}
			}
				if(unique) {
					System.out.println(ch[i]);
					break;
				}
			}
		
		
		
	}
}
