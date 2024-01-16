package com.collection2;

import java.util.Comparator;

public class SortBySalary implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		if(o1.getSalary()==o2.getSalary()) {
			return 0;
		}else if(o1.getSalary()>o2.getSalary()) {
			return -1;
		}else {
			return 1;
		}
		
	}

}
