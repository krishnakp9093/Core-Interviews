package com.oops;

public class BParameterizedConstSuper extends AParameterizedConstSuper{
	public String surname;
	public BParameterizedConstSuper(String surname) {
		super();
	 //super("Krishnaa");
	 this.surname = surname;
	 System.out.println(surname);
}
}
