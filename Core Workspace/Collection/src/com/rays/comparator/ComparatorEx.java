package com.rays.comparator;

public class ComparatorEx {

	public int id;
	public String name;
	public int salary;


	public ComparatorEx(int id ,String name,int salary) {
		this.id= id;
		this.name= name;
		this.salary=salary;
		
	}


	@Override
	public String toString() {
		return "ComparatorEx [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	
}
