package com.basics;

import java.util.Calendar;

public class Testing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//test1();
		//test2();
		//test3();
		//test4();
		//test5();
		//test6();
		//test7();
		//test8();
	    //test9();
		//test10();
		//test11();
		//test12();
		//test13();
		test14();
	}

	private static void test14() {
		// TODO Auto-generated method stub
		for (int i = 1; i <=5; i++) {
			for (int j = 5-i; j >0; j--) {
				System.out.print(" ");
			}
			for (int k = i; k >0; k--) {
				System.out.print(" * ");
			}
			System.out.println(" ");
		}
	}

	private static void test13() {
		// TODO Auto-generated method stub
	for (int i = 0; i < 5; i++) {
		for (int j = 0; j < i; j++) {
			
			System.out.print(" * ");
			
		}
		System.out.println();
		
	}
	
	}

	private static void test12() {
		// TODO Auto-generated method stub
	
		int [][] table = new int [10][10];
		
		for (int i = 0; i < table.length; i++) {
			for (int j = 0; j < table.length; j++) {
				
				table [i][j] = (i+1)*(j+1);
				
				System.out.print(table [i][j] + "\t");
				
			}
			System.out.println(" ");
			
			
				}
		
	}

	private static void test11() {
		// TODO Auto-generated method stub
		
		for (int i = 0; i < 5; i++) {
			
			System.out.println((int)(Math.random()*1000));
		}
		
	}

	private static void test10() {
		// TODO Auto-generated method stub
	
		int num = 15;
		int count = 0;
		
		for (int i = 2; i <num; i++) {
			
			if(num%i==0) {
				count++;
			}
		}
		if(count !=0) {
			System.out.println("Yes , it is !!!");
		}else {
			System.out.println("No");
		}
	}

	private static void test9() {
		// TODO Auto-generated method stub
		
		int num = 3934;
		int a=num;
		int rev=0;
		int rem;
		while(a>0) {
			rem=a%10;
			rev = rev*10+rem;
		    a=a/10;
		    
		}
		if(rev==num) {
			System.out.println("Yess , it is palindrone !!!");
		}else {
			System.out.println("No , it is not palindrone !!!");
			
		}
		
		
	}

	private static void test8() {
		// TODO Auto-generated method stub
		
		int [] notes = {2000,500,200,100,50,20,10,5,2,1};
		int money = 54667;
		int count;
		
		
		for (int i = 0; i < notes.length; i++) {
			
			count = money/notes[i];
			
			if(count >0) {
				System.out.println(notes[i] +" = "+ count);
				money = money%notes[i];
			}
			
		}
	}

	private static void test7() {
		// TODO Auto-generated method stub
		int [] a = {8,7,6,9,45,34,66,77};
		int b= 0;
		int c = 0;
		for (int i = 0; i < a.length; i++) {
			
			if (b<a[i]) {
				b=c;
				c=a[i];
			}
			if(c<a[i] && b>a[i]) {
				b=a[i];
			}
		}
		System.out.println(b);
		
	}

	private static void test6() {
		// TODO Auto-generated method stub
		int a =0;
		int b=1;
		int c;
		
		for (int i = 0; i < 10; i++) {
			
			c=a+b;
			System.out.print(c+" ");
			a=b;
			b=c;
		}
		
	}

	private static void test5() {
		// TODO Auto-generated method stub
		int num = 5;
		int fact = 1;
		for (int i =num; i > 0; i--) {
			
			fact = fact*i;
		}
		System.out.println(fact);
		
	}

	private static void test4() {
		// TODO Auto-generated method stub
		int num =12345;
		int a = num;
		int rem;
		int rev=0;
		while (a !=0) {
		
			rem = a%10;
			rev = rev*10+rem;
			a=a/10;
		}
		
		System.out.println(rev);
	}

	private static void test3() {
		// TODO Auto-generated method stub
		
		Calendar cal = Calendar.getInstance();
		for (int i = 0; i < 12; i++) {
			
		
		cal.add(Calendar.DATE, 31);
		System.out.println(cal.getTime());
	}
	}

	private static void test2() {
		// TODO Auto-generated method stub
		
		int [] a = {12,13,14,34,45,56,67,76,10,97};
		int temp=0;
		
		for (int i = 0; i < a.length; i++) {
			for (int j = i+1; j < a.length; j++) {
				
				if(a[i]>a[j]) {
					temp=a[j];
					a[j]=a[i];
					a[i]=temp;
				}
			}
			System.out.print(a[i]+" ");
		}
		
		
	}

	private static void test1() {
		// TODO Auto-generated method stub
		
		int num =153;
		int arm = 0;
		int rem;
		int a=num;
		while(a !=0) {
	
			rem=a%10;
			arm += (rem*rem*rem);
			a=a/10;
		}
		if(arm==num) {
			System.out.println("Yes it is !!!");
		}else {
			System.out.println("No its not !!!");
		}
		
	}

}
