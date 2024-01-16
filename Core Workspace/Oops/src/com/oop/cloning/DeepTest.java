package com.oop.cloning;

public class DeepTest {

	public static void main(String[] args) throws CloneNotSupportedException {

		DeepAddress add = new DeepAddress();
		add.setCity("Indore");
		
		DeepStudent s1 = new DeepStudent();
		s1.setAdd(add);
		s1.setRollno(101);
		
		DeepStudent s2 = (DeepStudent)s1.clone();
		s2.add.city="Bhopal";
		s2.setRollno(102);
		
		System.out.println(s1.getRollno()+ " "+ s1.add.getCity());
		System.out.println(s2.getRollno()+" "+s2.add.getCity());
	}

}











