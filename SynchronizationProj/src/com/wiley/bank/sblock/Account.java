package com.wiley.bank.sblock;
class Account {
	public int balance;
	public int accountNo;
	void displayBalance() {
		System.out.println("Account No: " + accountNo + "\nBalance: " + balance+"\n\n");
	}

	    void deposit(int amount){
			balance = balance + amount;
			System.out.println( amount + " is deposited");
			displayBalance();
	   }

	    void withdraw(int amount){
			  balance = balance - amount;
			  System.out.println( amount + " is withdrawn");
			  displayBalance();
	   }
}