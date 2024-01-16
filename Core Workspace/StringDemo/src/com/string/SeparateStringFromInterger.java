//WAP to remove Integer
package com.string;

public class SeparateStringFromInterger {

	public static void main(String[] args) {
		String name="Neer12a69j";
		String result = "";
		String result2 = "";
		
		int count = 0;
		int num = 0 ;
		
		char[] ch = name.toCharArray();
		for(int i=0; i<ch.length; i++) {
			if(!Character.isDigit(ch[i])) {
				result = result + ch[i];
				 count++;
					
			}else {
				
				result2 = result2 + ch[i];
				
				num++;
					
			}
		}
		System.out.println(result);
		System.out.println("alph = "+count);
	    System.out.println(result2);
	    System.out.println("num = "+num);
	    
	
	}

}
