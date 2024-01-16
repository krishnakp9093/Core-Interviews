package com.oop.practice3;

public class TestShallow {

	public static void main(String[] args) throws CloneNotSupportedException{

		ShallowClonee s1 = new ShallowClonee();
		s1.setId(101);
		
		ShallowClonee s2 = (ShallowClonee)s1.clone();
		s2.setId(102);
		
		System.out.println(s1.id);
		System.out.println(s2.id);
		
	}

}
