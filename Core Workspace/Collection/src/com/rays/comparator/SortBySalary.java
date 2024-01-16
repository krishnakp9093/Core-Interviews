 package com.rays.comparator;

import java.util.Comparator;

public class SortBySalary implements Comparator<ComparatorEx>{

	@Override
	public int compare(ComparatorEx o1, ComparatorEx o2) {
		
		if(o1.salary==o2.salary) {
		return 0;
		}
		else if(o1.salary<o2.salary){
			return -1;
		}else {
		
		return 1;
	}
	}	
}