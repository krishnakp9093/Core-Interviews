package com.oop.practice3;

public class TestDeep {

	public static void main(String[] args) throws CloneNotSupportedException {

		Student st = new Student();
		st.setId(1001);
		
		Student st1 = (Student) st.clone();
		
		st1.add.city="Bhopal";
		st1.id=102;
		
		System.out.println(st.getId());
		System.out.println(st.add.getCity());
		System.out.println(st1.id);
		System.out.println(st1.add.city);
		
	}

}
