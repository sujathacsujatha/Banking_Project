package com.icici;
//BankImpl IS-A Bank
public  class BankImpl  implements Bank {
//balance -> constructor
	//override 3 methods
	int balance;
	BankImpl (int balance){
		this.balance=balance;
	}
	@Override
	public void deposit(int amount) {
		System.out.println("Depositing Rs."+amount);
		balance=balance+amount;//balance+=amount;
		System.out.println("Amount Deposited Successfully");
	
	}
	@Override
	public void withdraw(int amount) {
		if(amount<= balance) {
		System.out.println("withdrawing Rs."+amount);
		balance-=amount;//balance= balance-amount;
		System.out.println("Amount withdraw Successfully");
	}
		else {
			//create InsufficientBalanceException -> invoke using throw keyword
			try {
			throw new InsufficientBalanceException("Insufficient Balance!");
		}
			catch(Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}
	@Override
	public int getbalance() {
		return balance;
	}
}
