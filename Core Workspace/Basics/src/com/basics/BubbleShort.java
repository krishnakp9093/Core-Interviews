package com.basics;

public class BubbleShort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] a = {10,20,50,1,2,3,4,5};
		int b= 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = i+1; j < a.length; j++) {
				
				if(a[i]>a[j]) {
					b=a[j];
					a[j]=a[i];
					a[i]=b;
				}
			}System.out.print(a[i] + ",");
			
		}

	}

}
