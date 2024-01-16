package com.oop.cloning;

public class Address implements Cloneable{
	
	public String city;
	
	public Address(String city) {
		this.city=city;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
}
