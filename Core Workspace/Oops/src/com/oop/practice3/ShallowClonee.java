package com.oop.practice3;

public class ShallowClonee implements Cloneable{

	public int id;
	
	public void setId(int id) {
		this.id=id;
	}
	public int getId() {
		return id;
	}
	
	public Object clone() throws CloneNotSupportedException{
		return super.clone();
	}
}
