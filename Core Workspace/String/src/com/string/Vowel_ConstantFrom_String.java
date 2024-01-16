package com.string;

public class Vowel_ConstantFrom_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "miscellaneus";
		int x = 0;
		int y = 0;
		for (int i = 0; i < str.length(); i++) {
			
			if(str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i'
				 ||	str.charAt(i)=='o' || str.charAt(i)=='u') {
				
				System.out.println(str.charAt(i) + " "+ i);
				     x++;

			}else if (str.charAt(i)>='a' && str.charAt(i)<='z') {
				
				//System.out.println(str.charAt(i));
				
				y++;
				
			}
			
		}
		System.out.println("vowel = " + x);
		System.out.println("constant = " + y);
		

	}

}
