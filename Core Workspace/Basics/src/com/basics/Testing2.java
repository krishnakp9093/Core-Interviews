package com.basics;

import java.util.Calendar;

public class Testing2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//pattern1();
		//pattern2();
	    //calen();
		//arm1();
		//bubble();
		//reverseDigit();
		//factorial();
		//fibbonacci();
	    //highest2nd();
	    //notecount();
	    //primeNo();
	    //random();
	    //switc();
		//array2d();
        //missing();
	    //palindrone();
        arraySearch();
	
	
	}

	private static void arraySearch() {
		// TODO Auto-generated method stub
		int [] a = {9,8,7,6,5,4,3,2,1};
		
		int b= position(a,0);
		
	}

	private static int position(int[] arr, int num) {
		// TODO Auto-generated method stub
		
		int b=0;
		for (int i = 0; i < arr.length; i++) {
			
			if(num==arr[i]) {
				b=i;
				break;
			}else if(num!=arr[i]) {
				b=-1;
			}
			
		}
		System.out.println(num +" : is at index = "+b);
		return b;
	}

	private static void palindrone() {
		// TODO Auto-generated method stub
		int num = 12321;
		int a=num;
		int rem;
		int rev =0;
		while(a!=0) {
			rem=a%10;
			rev=rev*10+rem;
			a=a/10;
		}
		if(rev==num) {
			System.out.println("yes, it is !!!");
		}else {
			System.out.println("no,its not !!!");
		}
	}

	private static void missing() {
		// TODO Auto-generated method stub
		int [] a = {12,13,14,15};
		int [] b = {12,13,14};
		int sumA = 0;
		int sumB =0;
		for (int i = 0; i < a.length; i++) {
          sumA += a[i];			
		}
		for (int i = 0; i < b.length; i++) {
			sumB += b[i];
		}
		
		System.out.println(sumA-sumB);
		
	}

	private static void array2d() {
		// TODO Auto-generated method stub
		int [][] a = new int [10][10];
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				a[i][j]=(i+1)*(j+1);
			
			System.out.print(a[i][j] + "\t");
		}
			System.out.println(" ");
		}
	}

	private static void switc() {
		// TODO Auto-generated method stub
		int i=23;
		switch (i) {
		case 0:
			System.out.println("case0");
			break;

        case 1:
			System.out.println("case1");
			break;

		default:
			System.out.println("default case");
			break;
		}
	}

	private static void random() {
		// TODO Auto-generated method stub
		for (int i = 0; i <=5; i++) {
			System.out.print((int)(Math.random()*100)+ " ");
		}
	}

	private static void primeNo() {
		// TODO Auto-generated method stub
		int num =6;
		int a=num;
		int count =0;
		
		for (int i = 2; i < 5; i++) {
			if(a%i==0) {
				count++;
			}		
		}if(count==0) {
			System.out.println("yes, it is !!!");
		}else {
			System.out.println("no,its not !!!");
		}
	}

	private static void notecount() {
		// TODO Auto-generated method stub
		int [] notes = {2000,500,200,100,50,20,10,5,2,1};
		int money = 5534;
		int count = 0;
		for (int i = 0; i < notes.length; i++) {
			count = money/notes[i];
			
		
		if(count>0) {
			System.out.println(notes[i] +" = "+ count);
			money=money%notes[i];
		}
		
		}
	}

	private static void highest2nd() {
		// TODO Auto-generated method stub
		int [] a = {12,13,45,65,67,55};
		int temp=0;
		int c=0;
		
		for (int i = 0; i < a.length; i++) {
			if(a[i]>temp) {
				temp=c;
				c=a[i];
			}
			if(c>a[i] && temp<a[i]) {
				temp=a[i];
			}
				}
		System.out.println(c);
		System.out.println(temp + " = second highest");
		
		
	}

	private static void fibbonacci() {
		// TODO Auto-generated method stub
		int a=0;
		int b=1;
		int c;
		for (int i = 0; i < 6; i++) {
			c=a+b;
			System.out.print(c + " ");
			a=b;
			b=c;
		}
	}

	private static void factorial() {
		// TODO Auto-generated method stub
		int num =6;
		int fact = 1;
		for (int i = num; i >0; i--) {
			fact = fact*i;
		}
		System.out.println(fact);
		
	}

	private static void reverseDigit() {
		// TODO Auto-generated method stub
		int num = 12345;
		int a=num;
		int rev=0;
		int rem;
		
		while(a!=0) {
			rem=a%10;
			rev = rev*10+rem;
			a=a/10;
		}
		System.out.println(rev);
	}

	private static void bubble() {
		// TODO Auto-generated method stub
	 int [] a = {19,18,16,15,26,34};
	 int temp;
	 for (int i = 0; i < a.length; i++) {
		for (int j = i+1; j < a.length; j++) {
			if(a[i]>a[j]) {
				temp=a[j];
				a[j] = a[i];
				a[i]=temp;
			}
		}
		System.out.print(a[i] + " ");
	}
		
	}

	private static void arm1() {
		// TODO Auto-generated method stub
		int num = 371;
		int a=num;
		int rem;
		int arm=0;
		
		while(a!=0) {
			rem=a%10;
			arm = arm+(rem*rem*rem);
			a=a/10;
		}
		if(num==arm) {
			System.out.println("Yes , it is !!!");
		}else {
			System.out.println("No , its not !!!");
		}
	}

	private static void calen() {
		// TODO Auto-generated method stub
		Calendar cal = Calendar.getInstance();
		for (int i = 0; i < 12; i++) {
			
			cal.add(Calendar.DATE, 30);
			System.out.println(cal.getTime());
		}
		
	}

	private static void pattern2() {
		// TODO Auto-generated method stub
		for (int i = 0; i <=5; i++) {
			for (int j = 5-i; j >0; j--) {
				System.out.print(" ");
			}
				for (int k = i; k > 0; k--) {
					
					System.out.print(" *");
				}
				
				System.out.println();

						}
	

					}
		
	

	private static void pattern1() {
		// TODO Auto-generated method stub
		for (int i = 1; i <=5; i++) {
			for (int j = 0; j < i; j++) {
				
				System.out.print(" *");
			}
		System.out.println();
		}
		
	}

}
