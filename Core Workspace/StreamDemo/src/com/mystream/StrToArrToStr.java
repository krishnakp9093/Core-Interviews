package com.mystream;

import java.util.Arrays;
import java.util.stream.Stream;

//stream to array distinct,sorted,limit & again stream
public class StrToArrToStr {

	public static void main(String[] args) {
		
		Stream in = Stream.of(8,7,7,4,4,3,7,6,4,4,4,5,1,2);
		
		Object[] s = in.distinct().sorted().limit(5).toArray();
		
		Stream str = Arrays.stream(s);
		
		str.forEach(System.out::println);
			
		}
	}

