package com.basics;

public class ArraySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] a= {9,8,7,6,5,4};

		int b = position(a,7);
	}

	private static int position(int[] arr, int num) {
		// TODO Auto-generated method stub
		int b=0;
		
		for (int i = 0; i < arr.length; i++) {
		
			if(num==arr[i]) {
				
				b=i;
		    
				break;
			}else if(num!=arr[i]) {
				
				b= -1;
			}
		}
		System.out.println(num + " : is at index = " + b);

		
		return b;
	}

}
