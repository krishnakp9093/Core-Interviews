package com.equalhashcode;

public class Test {

	public static void main(String[] args) {
 
		Demo d1 = new Demo(101, "raj", 100);
		Demo d2 = new Demo(101, "raj", 100);
		
		if(d1.equals(d2)) {
			if(d1.hashCode()==d2.hashCode()) {
			System.out.println("Equal");
		}
	}else {
		System.out.println("Not Equal");
	}
}
}
