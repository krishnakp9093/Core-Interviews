package com.oops;

public class B extends A  {
	
	public int a;
	public B() {
		super();
		System.out.println("defaut B");
	}	
		public B(int a) {
			super();
			this.a=a;
			System.out.println(a);
		}

}