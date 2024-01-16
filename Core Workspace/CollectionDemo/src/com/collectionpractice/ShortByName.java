package com.collectionpractice;

import java.util.Comparator;

public class ShortByName implements Comparator<ComparatorEx>{

	@Override
	public int compare(ComparatorEx o1, ComparatorEx o2) {
		return o1.name.compareTo(o2.name);
	}
}
