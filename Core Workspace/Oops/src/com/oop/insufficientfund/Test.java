package com.oop.insufficientfund;

public class Test {
public static void main(String[] args) {
	BankAccount b = new BankAccount();
	b.setAmount(5000);
	b.deposite(b.getAmount());
	b.withdraw(4000);
}
}
