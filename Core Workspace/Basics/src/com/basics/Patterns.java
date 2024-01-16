package com.basics;

public class Patterns {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//left();
		//leftdown();
		//right();
        //rightDown();
		//triangle();
		downTriangle();
	}

	private static void downTriangle() {
		// TODO Auto-generated method stub
		for (int i = 1; i <= 5; i++) {
			for (int j = 5; j >= i; j--) {
				System.out.print(i+" ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print(" ");
			}
			System.out.println();
		}
	}

	private static void triangle() {
		// TODO Auto-generated method stub
		
		for (int i = 1; i <= 5; i++) {
			for (int j = 5-i; j >=0; j--) {
				System.out.print(" ");
			}
	for (int k = 1; k <= i; k++) {
		System.out.print(" "+i);
		
	}			
	System.out.println();
			}
		}
	

	private static void rightDown() {
		// TODO Auto-generated method stub
		for (int i = 1; i <= 5; i++) {
			for (int j = 5; j >= i; j--) {
				System.out.print(i+" ");
			}
			System.out.println();
		}
		
	}

	private static void right() {
		// TODO Auto-generated method stub
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <=i; j++) {
				System.out.print(i+" ");
			}
			System.out.println();	
			}
		
	}

	private static void leftdown() {
		// TODO Auto-generated method stub
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(" ");
			}
			for (int k = 5; k >=i ; k--) {
				System.out.print(i);
			}
			System.out.println();
		}
		
	}

	private static void left() {
		// TODO Auto-generated method stub
		
		for (int i = 1; i <= 9; i++) {
			for (int j = 8; j >= i; j--) {
				
				System.out.print(" ");
				
			}
			
			for (int k = 1; k <= i; k++) {
				System.out.print(i);
			}
			
			System.out.println();
		}
	}

}
