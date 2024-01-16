package com.oop.cloning;

public class Student implements Cloneable {

	public Address add;
	public int id;

	public Student(int id) {
		this.id = id;
		add = new Address("Indore");

	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub

		Student student = (Student) super.clone();
		//student.add= (Address)add.clone();
		return student;
	}
}
