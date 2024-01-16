package com.oop.practice3;

public class Student implements Cloneable {

	public Address add;
	public int id;

	public Address getAdd() {
		return add;
	}

	public void setAdd(Address add) {
		this.add = add;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
		add = new Address();
		add.setCity("Indore");
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {

		Student st = (Student) super.clone();

		st.add = (Address) add.clone();

		return st;
	}

}
