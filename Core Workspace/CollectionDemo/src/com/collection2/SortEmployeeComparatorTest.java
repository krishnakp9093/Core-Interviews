package com.collection2;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortEmployeeComparatorTest {
public static void main(String[] args) {
	List<Employee> list=Arrays.asList(new Employee(1,"Aman",2000),
			new Employee(2,"Ram",4000),new Employee(3,"kamal",3000));
	
	String s="SortBySalary";
	//String s="SortByName";
	
	if(s.equals("SortByName")) {
		Collections.sort(list,new SortByName());
	}else {
		Collections.sort(list,new SortBySalary());
	}
	list.forEach(System.out::println);
}
}
 