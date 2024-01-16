package com.oop.cloning;

public class TestCons {

	public static void main(String[] args) throws CloneNotSupportedException {

		Student s = new Student(101);
		//Address add = new Address("Indore");
		
		
		Student s1 = (Student)s.clone();
		
		System.out.println(s.id+" "+s.add.city);
		
		s1.id=102;
		s1.add.city="Bhopal";
		System.out.println(s1.id +" "+ s1.add.city);
		System.out.println(s.add.city);
	}

}
