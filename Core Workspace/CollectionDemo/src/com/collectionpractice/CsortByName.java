package com.collectionpractice;

import java.util.Comparator;

public class CsortByName implements Comparator<Ccomparatr>{

	@Override
	public int compare(Ccomparatr c1 , Ccomparatr c2) {
		return c1.name.compareTo(c2.name);
	}
}
