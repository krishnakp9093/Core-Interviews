package com.exersice4_14;

public class Q12_Palindrome {
	public static void main(String[] args) {
		int number = 11111111;  
		//sidha or ulta same ho;

		int r;
		int n = number;
		int sum = 0;
		while (n > 0) {
			r = n % 10;
			sum = sum * 10 + r;
			n = n / 10;
		}
		//System.out.println(sum);

		if (sum == number) {
			System.out.println(number + "  is palindrone number");
		} else {
			System.out.println(number + "  is not palindrone number");

		}
		
	}

}
