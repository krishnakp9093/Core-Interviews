package com.basics;

public class TestFuncInterfaceLambaExp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FuncInterface fun = (a,b)->(a+b);
		
		int a=15;
		int b=17;

		System.out.println(fun.sum(a, b));
	}

}
