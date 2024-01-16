package com.streampractice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class LotteryTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Lottery> l = new ArrayList<Lottery>();

		l.add(new Lottery("Raj", 9093999991L));
		l.add(new Lottery("saj", 9093999554L));
		l.add(new Lottery("Ram", 9093999992L));
		l.add(new Lottery("Rohit", 9093999997L));
		
		
		l.stream().map(e->e.getNo()).distinct().collect(Collectors.collectingAndThen(Collectors.toList(), e->{
			Collections.shuffle(e);
			return e.stream();
		})).limit(2).forEach(e->System.out.println(e));

		System.out.println();
		
		l.stream().map(e->e.getName()).distinct().collect(Collectors.collectingAndThen(Collectors.toList(), e->{
			Collections.shuffle(e);
			return e.stream();
		})).limit(2).forEach(e->System.out.println(e));
	}

}
