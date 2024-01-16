package com.oop.insufficientfund;

public class BankAccount {

	private double amount;
	private double balance=0.0;
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	
	public void deposite(double money) {
		balance = balance + money;
		System.out.println(balance);
	}
	
	public void withdraw(double money) {
		if(balance>2000) {
			balance = balance - money;
			System.out.println(balance);
		}else {
			System.out.println("Insufficient balance!!!!");
		}
	}
	
	
}
