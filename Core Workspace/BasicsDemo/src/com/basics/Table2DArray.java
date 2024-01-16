package com.basics;

public class Table2DArray {

	public static void main(String[] args) {
		int[][] t = new int[10][10]; 
		
		for(int i=0; i<t.length; i++) {
			for(int j=0; j<t.length; j++) {
				t[i][j] = (i+1)*(j+1);
				
				//Horizontal
				System.out.print(t[i][j] + "\t");
				
				//vertical
				//System.out.println(t[i][j] + "\t");
			}
			System.out.println(" ");
		}
	}

}