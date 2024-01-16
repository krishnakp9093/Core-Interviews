package com.string;

/**
 *  Use of == operator and equals method in java.
 *  
 *   The main  difference of is that == equals  operator is checks the reference/address of the object 
 *   
 *   equals() method checks the values  of the object.
 *   
**/

public class EqualOperator_EqualMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		

		String name1 = "Krishhna";
		String name2 = "Krishhna";
		String name3 = "krishhna";
		String name4 = new String("Krishhna");
		String name5 = new String("Krishhna");
		String name6 = new String("Patel");
		
		//System.out.println("1 = "+ name1 == name2); -->not work 
		
		System.out.println("1"+(name1 == name2));
		System.out.println(name1 == name3);
		System.out.println(name1 == name4);
		System.out.println(name4 == name5);
		
		System.out.println("5 = "+ name1.equals(name2));
		System.out.println("6 = "+ name1.equals(name3));
		System.out.println("7 = "+ name1.equals(name4));
		System.out.println("8 = "+ name3.equals(name6));
		
	}

}
