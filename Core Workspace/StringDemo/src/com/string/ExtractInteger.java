package com.string;

import java.util.Arrays;

public class ExtractInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] str = { "Krishnna1242" };

		String st = Arrays.toString(str);

		// System.out.println(st.length());

		int[] num = new int[st.length()];
		int count = 0;

		for (int i = 0; i < st.length(); i++) {
			if (Character.isDigit(st.charAt(i))) {
				num[i] = num[i] + Integer.parseInt(String.valueOf(st.charAt(i)));
				count++;
			}
		}
		if(count !=0 && count >= 1)
		
			System.out.println(Arrays.toString(num));
		
	}

}
