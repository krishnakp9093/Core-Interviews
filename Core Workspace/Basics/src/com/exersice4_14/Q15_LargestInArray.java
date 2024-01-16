package com.exersice4_14;

public class Q15_LargestInArray {
	public static void main(String[] args) {
		int a [] = {12,14,16,18,20,22};
		int largest = a[0];
		for (int i = 0; i < a.length; i++) {
			if(a[i] > largest) {
				largest = a[i];
				System.out.println(largest);
			}
			}
	System.out.println("largest element array is = " + largest);	
			
		}
}
