package com.mystream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

//program to sort employee list by department id

class Employee1 {

	private String name;
	private int departmentId;

	public Employee1(String name, int departmentId) {
		this.name = name;
		this.departmentId = departmentId;
	}

	public String getName() {
		return name;
	}

	public int getDepartmentId() {
		return departmentId;
	}
}

public class SortEmployeesByDepartmentId {

	public static void main(String[] args) {

		List<Employee1> employees = new ArrayList<>();

		employees.add(new Employee1("Ram", 2));
		employees.add(new Employee1("Shyam", 1));
		employees.add(new Employee1("Jay", 1));
		employees.add(new Employee1("Vijay", 3));

		List<Employee1> sortedEmployees = employees.stream().sorted(Comparator.comparingInt(Employee1::getDepartmentId))
				.collect(Collectors.toList());

		sortedEmployees
				.forEach(employee -> System.out.println(employee.getName() + " : " + employee.getDepartmentId()));

	}
}
