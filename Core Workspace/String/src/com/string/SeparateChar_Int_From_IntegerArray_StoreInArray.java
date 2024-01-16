package com.string;

import java.util.Arrays;

public class SeparateChar_Int_From_IntegerArray_StoreInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] str = { "Krishhna134" };

		String s = Arrays.toString(str);

		int[] num = new int[s.length()];

		int count = 0;

		for (int i = 0; i < s.length(); i++) {
			if (Character.isDigit(s.charAt(i))) {
				num[i] = num[i] + Integer.parseInt(String.valueOf(s.charAt(i)));
				count++;
			}
		}
		System.out.println(Arrays.toString(num));
	}

}
