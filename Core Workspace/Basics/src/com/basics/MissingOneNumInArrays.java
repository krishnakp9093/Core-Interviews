package com.basics;

public class MissingOneNumInArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] a = {12,23,34,45};
		int [] b = {12,23,34};
		int sumA  = 0;
		int sumB=0;
		for (int i = 0; i < a.length; i++) {
			sumA += a[i];
		}
		for (int i = 0; i < b.length; i++) {
		    sumB += b[i];	
		}

		System.out.println(sumA-sumB);
	}

}
