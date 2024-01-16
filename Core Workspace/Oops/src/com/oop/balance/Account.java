package com.oop.balance;

public class Account implements Cloneable {

	public int balance = 0;

	public Account() {
	}

	public Account(int balance) {
		this.balance = balance;
	}

	public int getbalancet() {
		System.out.println(balance);
		return balance;

	}

	@Override
	protected Object clone() throws CloneNotSupportedException {

		return super.clone();
	}
}