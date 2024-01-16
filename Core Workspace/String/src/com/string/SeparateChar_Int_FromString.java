package com.string;

public class SeparateChar_Int_FromString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str ="ram2121";
		String digit= "";
		String alph = "";
		
		for (int i = 0; i < str.length(); i++) {

			char ch = str.charAt(i);
					
			if(Character.isDigit(ch)) {
				
				digit = digit + ch;
				
			}else {
				
				alph = alph + ch;
			}
			
		}System.out.println(digit);
		System.out.println(alph);
		
	}

}
