//WAP to print reverse String
package com.string;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name = "Krishna";
		
		/*
		 * length start from 1 and indexing starts from 0 so str carry 6 char and t
		 * there length is 7 so that we did lenth-1=last index 
		 * name.length-1 used to initialise the value of i from last index
		 * 
		 */	
		
		
		//Approach-1
      for (int i = name.length()-1; i >= 0; i--) {
    	  
    	  System.out.print(name.charAt(i));
		
	}
      System.out.println(" ");
		
      
      
		//Approach-2
      char [] ch = name.toCharArray();
      for (int i = name.length()-1; i >= 0; i--) {
    	  
		System.out.print(ch[i]);
	}
      
      System.out.println(" ");
  	
      
      
    //Approach-3
  	StringBuffer sb = new StringBuffer(name);
  	System.out.println(sb.reverse());
  	
  	
  	
  	
  	
  	//Approach-4
  	StringBuilder sbuilder = new StringBuilder("Krishna");
  	System.out.println(sbuilder.reverse());
    
      
      
	}

}
