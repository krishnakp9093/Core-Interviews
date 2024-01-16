package com.practice;

public class Account2 {

	public double balance;

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public double withdrawl(double d) throws WithdrawalException {

		balance = balance - d;
		if (balance < 2000) {
			throw new WithdrawalException("Insufficient Balance !!!");
		}
		return balance;

	}

}
