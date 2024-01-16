package com.string;

public class OccurenceOfAllCharInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//StringBuffer sb = new StringBuffer("Krishhnna");
		//String s = sb.toString();
		
		String s = "Krishhnna";

	
		for (char c = 'a'; c <= 'z'; c++) {
			int count = 0;

			for (int i = 0; i < s.length(); i++) {
				if (c == s.charAt(i)) {
					count++;
				}
 
			}
			if (count > 0) {
				System.out.println(c +" "+ count);
				
			}
		}

	}

}
