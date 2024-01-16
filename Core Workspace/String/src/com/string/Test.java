package com.string;

public class Test {
public static void main(String[] args) {
	String name="krishnnalpaaaaal";
	
	for(char ch='a';ch<='z';ch++) {
		int count =0;
		for(int i=0;i<name.length();i++) {
			if(ch==name.charAt(i)) {
				count++;
			}
		}
		
		if(count!=0) {
			System.out.println(ch+":"+count);
		}
	}
}
}
