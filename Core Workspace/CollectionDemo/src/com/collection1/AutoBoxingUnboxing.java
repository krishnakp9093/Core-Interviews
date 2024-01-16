package com.collection1;

public class AutoBoxingUnboxing {

	public static void main(String[] args) {

		//AutoBoxing
		
		int primitiveInt = 1;
		//primitiveInt=(Integer)null;
		Integer wrapperInt = primitiveInt;
		//wrapperInt=null;
		
		System.out.println("Primitive Int :"+ primitiveInt);
		System.out.println("Wrapper Int :"+ wrapperInt);
	

	//Unboxing
	
	Integer wrapperInt1 = new Integer(15);
	int primitiveInt1 = wrapperInt1;
	
	System.out.println(wrapperInt1);
	System.out.println(primitiveInt1);
    
	
}
}