package com.collectionpractice;

import java.util.Comparator;

public class CsortBySalary implements Comparator<Ccomparatr>{
	
	@Override
	public int compare(Ccomparatr c1 ,Ccomparatr c2) {
		if(c1.salary==c2.salary) {
			return 0;
			
		}else if (c1.salary<c2.salary) {
			return -1;
		}else {
			return 1;
		}
	}

}
