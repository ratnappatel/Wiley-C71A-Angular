package com.wiley.bank;

class TransactionDeposit implements Runnable{
	int amount;
	Account accountX;
	
	TransactionDeposit(Account x, int amount){
		accountX = x;
		this.amount = amount;
		new Thread(this).start();
	}
	
	public void run(){
		accountX.deposit(amount);
	}
}