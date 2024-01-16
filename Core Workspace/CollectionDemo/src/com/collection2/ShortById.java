package com.collection2;

import java.util.Comparator;

public class ShortById implements Comparator<ComparatorEx>{

	@Override
	public int compare(ComparatorEx o1, ComparatorEx o2) {
		return o1.id-o2.id;
	}
	
}