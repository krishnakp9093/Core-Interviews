package com.basics;

public class PrimeNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num = 15;
		int a=num;
		int count=0;
		for (int i = 2; i < num; i++) {
			
			if(a%i==0) {
				count++;
			}
			
		}
		if(count==0) {
			System.out.println("Prime Number");
		}else {
			System.out.println("Not Prime Number");
		}

	}

}
