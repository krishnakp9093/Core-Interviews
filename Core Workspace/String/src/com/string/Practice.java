package com.string;

import java.util.Arrays;


public class Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// occurenceOfAll();
		// ascii();
		//onPlaceReverse();
		//reverseString();
		//occurenceOfAnyOne();
        //Vowel_Consonant();
		//SeparateChar_Int_FromString();
		//SeparateChar_Int_FromString_StoreInArray();
		SeparateChar_Int_From_IntArray_StoreInArray();
		
	}

	private static void SeparateChar_Int_From_IntArray_StoreInArray() {
		// TODO Auto-generated method stub
		
		String str = "krishnaa123patel";
		
		int [] num = new int [str.length()];
		
		int count = 0;
		
		for (int i = 0; i < num.length; i++) {
			
			if(Character.isDigit(str.charAt(i))) {
				num[i] = num[i] + Integer.parseInt(String.valueOf(str.charAt(i)));
				count++;
			}
		}
		
		
		System.out.println(Arrays.toString(num));
		
	}

	private static void SeparateChar_Int_FromString_StoreInArray() {
		// TODO Auto-generated method stub
		
		String str = "sumit123patel";
		char[] ch = str.toCharArray();
		String digit= "";
		String alph = "";
		
		for (int i = 0; i < ch.length; i++) {
			
			if(Character.isDigit(ch[i])) {
				
				digit = digit+ch[i];
			}else {
				alph = alph+ch[i];
			}
		}
		/*
		 * System.out.println("alph : " + alph); System.out.println("digit : " + digit);
		 */
		char[] c = digit.toCharArray();
		char[] d = alph.toCharArray();
		
		System.out.println(Arrays.toString(c));
		System.out.println(Arrays.toString(d));

	}

	private static void SeparateChar_Int_FromString() {
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

	private static void Vowel_Consonant() {
		// TODO Auto-generated method stub
		
		String str = "Krishnaa";
		int x=0;
		int y=0;
		
		for (int i = 0; i < str.length(); i++) {
			
			if(str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i'
					 ||	str.charAt(i)=='o' || str.charAt(i)=='u') {
		
			            x++;
			            System.out.println(str.charAt(i));
			         
		}else if(str.charAt(i)>='a' && str.charAt(i)<='z'){
			 y++;
			 
			// System.out.println(str.charAt(i));
		}
				
		}	
		System.out.println("vowel : " +x);
	}

	private static void occurenceOfAnyOne() {
		// TODO Auto-generated method stub
		
		String str = "krishhna222";
		int j = 0;
		for (int i = 0; i < str.length(); i++) {
 
			char ch = str.charAt(i);
            String st = String.valueOf(ch);
            
            if(st.matches("2")) {
            	j++;
            }
		
		}
		System.out.println(j);
		
	}

	private static void reverseString() {
		// TODO Auto-generated method stub
	
		String str = "krishna";
		
		for (int i = str.length()-1; i >=0; i--) {
			
			System.out.print(str.charAt(i));
			
		}
		
	}

	private static void onPlaceReverse() {
		// TODO Auto-generated method stub
		String str = "vinay kumar mehta";
		String[] st = str.split(" ");

		for (int i = 0; i < st.length; i++) {

			// System.out.println(st[i]);

			for (int j = st[i].length() - 1; j >= 0; j--) {

				System.out.print(st[i].charAt(j));
			}
			System.out.print(" ");
		}

	}

	private static void ascii() {
		// TODO Auto-generated method stub
		String str = "krishhna220";

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			System.out.print((int) ch + " ");

		}

	}

	private static void occurenceOfAll() {
		// TODO Auto-generated method stub
		String str = "Krishhnna";

		for (char ch = 'a'; ch <= 'z'; ch++) {
			int count = 0;
			for (int i = 0; i < str.length(); i++) {

				if (str.charAt(i) == ch) {

					count++;
				}
			}
			if (count > 0) {
				System.out.println(ch + " " + count);

			}

		}

	}

}
