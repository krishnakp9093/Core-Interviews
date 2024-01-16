package com.exception03;

public class WithdrawalAccount {
	private double balance;

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public double withdraw(double d) throws WithdrawalException {
		balance = balance - d;
		if (balance < 2000) {
			WithdrawalException e = new WithdrawalException("Insufficient Balance !!!");
			throw e;
		}
		return balance;
	}
}
