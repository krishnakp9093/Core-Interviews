package com.exception02;

public class TestUnchecked {

	public static void main(String[] args) {
		
		int i = 5;
		
		if (i!=5) {
			System.out.println("i is not equal");
		}else {
			RuntimeException r = new RuntimeException("Wrong number");
			
			throw r;
		}
	}
}
