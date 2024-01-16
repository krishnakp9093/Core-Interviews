package com.string;

public class OccurenceOfAnyOneLetterInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name = "Krishhnna";
		int j = 0;
		
		for (int i = 0; i < name.length(); i++) {
			
			char c = name.charAt(i);
			//System.out.println(c);
			
			String k = name.valueOf(c);
			
			
			if(k.matches("h")) {
				j++;
			}
			
					}
		System.out.println(j);
 		

	}

}
