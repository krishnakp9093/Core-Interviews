package com.exersice4_14;

public class Q14_AvgOfOddEven {
	public static void main(String[] args) {
		int sum = 0;
		int count = 0;
		for (int i = 2; i <  100; i = i+2) {
			System.out.println(i);
			count++;
			
			sum = sum + i;
				
		}
	System.out.println("sum = "+ sum);
	
	sum = sum/count;
	System.out.println("avg = "+ sum);

	}

}



