package com.exception03;

public class ArrayIndexOutOfBoundsExceptionEx {

	public static void main(String[] args) {
		int[] a = {2,3,4};
		try {
			
				System.out.println(a[3]);
			
			
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBoundsException.........");
		}
	}

}
