package com.string;

public class TestPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "nayan";
		String name = str.toLowerCase();
		boolean isAnagram = true;

		for (int i = name.length() - 1; i >= 0; i--) {

			for (int j = 0; j < name.length(); j++) {
						
				if ((name.charAt(j)) == (name.charAt(i))) {
					isAnagram = true;
				} else {
					isAnagram = false;
				}
			}
		}
		System.out.println("isAnagram  =  " + isAnagram);
	}
}
