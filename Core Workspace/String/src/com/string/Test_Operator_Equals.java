package com.string;

public class Test_Operator_Equals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "krishna";
		String s2 = "krishna";
		String s3 = "Krishna";
		
		String s4 = new String("krishna");
		String s5 = new String("krishna");
		String s6 = new String("Krishna");
		char [] ch = {'S','U','N'};
		String s7 = new String(ch);
		String s8 = "SUN";
		
		
		System.out.println(s1.equals(s2));//true
		System.out.println(s1.equals(s3));//false
		System.out.println(s1.equals(s4));//true
		System.out.println(s1.equals(s6));//false
		System.out.println(s1==s2);//true
		System.out.println(s1==s3);//false
		System.out.println(s1==s5);//false
		System.out.println(s4==s5);//false
		System.out.println(s5==s6);//false
		
		System.out.println(s7.equals(s8));//true
		System.out.println(s7==s8);//false
		
	}

}
