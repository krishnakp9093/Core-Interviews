package com.practice;

public class TestAccount {

	public static void main(String[] args) {
		
		Account  a = new Account();
		a.setBalance(10000);
		try {
			a.withdrawl(9000);
			System.out.println(a.getBalance());
			
		}catch(WithdrawalException e){
			//e.getStackTrace();
			System.out.println(e.getMessage());
		}

	}

}
