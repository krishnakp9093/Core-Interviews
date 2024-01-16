package com.practice;

public class Test02 {

	public static void main(String[] args) {

		Account2 a= new Account2();
		a.setBalance(6000);
		try {
			a.withdrawl(5500);
			System.out.println(a.getBalance());
		}catch(WithdrawalException e){
			System.out.println(e.getMessage());
		}
		
	}

}
