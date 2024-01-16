package com.basics;

import java.util.Scanner;

public class ArmstrongNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//approach1();
		approach2();//wrong program
		
		
	}

	private static void approach2() {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Number : ");
		int num = sc.nextInt();
		int leng = 0;
		int t1 = num;
		
		while(t1!=0) {
			
			leng =leng + 1;
			t1=t1/10;
			
		}
		
		int t2 = num;
		int arm=0;
		int rem;
		
		while(t2!=0) {
			int multi =1;
			rem=t2%10;
			for (int i = 1; i <leng; i++) {
				multi=multi*rem;
			}
			arm=arm+multi;
			t2=t2/10;
		}
		
		if(arm==num) {
			System.out.println("It is an armstong number");
			
		}else {
			System.out.println("It is not an armstong number");
				
		}
	}

	private static void approach1() {
		// TODO Auto-generated method stub
		int a = 370;
		int t=a;
		int r;
		int sum=0;
		while(t!=0) {
	 
			r=t%10;
			sum = sum + (r*r*r);
			t = t/10;
		}
		System.out.println(sum);
		if(sum==a) {
			System.out.println("It is an armstong number");
			
		}else {
			System.out.println("It is not an armstong number");
				
		}
	}

}
