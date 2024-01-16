package com.basics;

public class Triangle {

	public static void main(String[] args) {
		for(int i =1; i<=5; i++) {
			for(int j = 5-i; j>0; j--) {
				System.out.print(" ");
			}
			for(int k = i; k>0; k--) {
				System.out.print(" *");
				//System.out.print(i
					//	+" ");
			}
			System.out.println();
		}
	}

}
