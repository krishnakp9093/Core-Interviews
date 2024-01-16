package com.string;

import java.util.Arrays;

public class SeparateChar_Int_FromString_StoreInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name = "krishna1234";
		char[] ch = name.toCharArray();
		String digit = "";
		String alph = "";
		
		for (int i = 0; i < ch.length; i++) {
			
			if (Character.isDigit(ch[i])) {
				digit = digit + String.valueOf(ch[i]); 
			}else {
				alph = alph + String.valueOf(ch[i]);
			}
			
				}
		//System.out.println(digit);
		//System.out.println(alph);

		char[] x = digit.toCharArray();
		char[] y = alph.toCharArray();
		
		System.out.println(Arrays.toString(x));
		System.out.println(Arrays.toString(y));
		
		
	}

}
