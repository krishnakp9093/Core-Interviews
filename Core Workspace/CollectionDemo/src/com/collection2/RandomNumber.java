package com.collection2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;

public class RandomNumber {

	public static void main(String[] args) {
		int j=1;
		ArrayList list=new ArrayList();
		for(int p=1;p<=10000;p++) {
			list.add(p);
		}
		System.out.println("list-----"+list);
		Random r=new Random();
		for(int i=1;i<=50;i++) {
			int z=r.nextInt(10000); // 0-10000, this range will provide random number up to 10k and return index
			System.out.println(j++ +" ---- "+list.get(z)); // p is index
		}
		HashSet hs=new HashSet();
		
		System.out.println("hhhhhhhh"+hs.add(list));
		System.out.println("hs0000----"+hs);
	}
}
