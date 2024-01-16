package com.basics;

public class Triangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//approach01();
		approach02();

	}

	private static void approach02() {
		// TODO Auto-generated method stub
		for (int i = 1; i <=5; i++) {
		
			for (int j = 5; j >=1; j--) {
				
				if(j>i) {
					System.out.println(" ");
				}else {
					System.out.println("*");
				}
			}
		}	System.out.println();
		
		
	}

	private static void approach01() {
		// TODO Auto-generated method stub
	
		for (int i = 0; i <=5; i++) {
			for (int j = 5-i; j >0; j--) {
				
				System.out.print(" ");
			}
			for (int k = i; k > 0; k--) {
				System.out.print(" *");
			}
			
			System.out.println();
		}
	}

}
