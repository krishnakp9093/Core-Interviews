package com.streampractice;

import java.util.Arrays;
import java.util.List;

public class PrimeNo {
	
	public static boolean isPrime(int x) {
		
		int count = 0;
		
		
		if(x==1) {
			return false;
		}
		for (int i = 2; i < x-1; i++) {
			if(x%i==0) {
				count++;
			}
			
		}
		return count==0;
	}
	
	public static void main(String[] args) {
		
		List<Integer> l = Arrays.asList(4,5,7,9,3,2,2);
		
		l.stream().filter(e->isPrime(e)).forEach(n->System.out.println(n));
		
	}
}
