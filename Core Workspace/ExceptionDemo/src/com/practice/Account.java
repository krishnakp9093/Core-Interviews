package com.practice;

public class Account {

	private double balance;

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public double withdrawl(double d) throws WithdrawalException {
		balance = balance - d;

		if (balance < 2000) {
			WithdrawalException e = new WithdrawalException("Insufficient fund !!!");
			throw e;

		}
		return balance;
	}
}
