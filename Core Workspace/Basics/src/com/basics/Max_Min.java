package com.basics;

public class Max_Min {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		highest();
		lowest();
	}

	private static void lowest() {
		// TODO Auto-generated method stub
		int [] n = {9,8,7,34,4,56,7,8};
		
		int temp;
		for (int i = 0; i < n.length; i++) {
			for (int j = i+1; j < n.length; j++) {
				if(n[i]>n[j]) {
					temp=n[i];
					n[i]=n[j];
					n[j]=temp;
				}
			}
		}
		System.out.println("lowest is = " + n[0]);
		System.out.println("second last is = " + n[1]);
	}

		
	

	private static void highest() {
		// TODO Auto-generated method stub
		int [] n = {9,8,7,34,4,56,7,8};
	
		int temp;
		for (int i = 0; i < n.length; i++) {
			for (int j = i+1; j < n.length; j++) {
				if(n[i]<n[j]) {
		            temp=n[i];
					n[i]=n[j];
					n[j]=temp; 
				}
			}
		}
		System.out.println("largest is = " + n[0]);
		System.out.println("second largest is = " + n[1]);
	}

}
