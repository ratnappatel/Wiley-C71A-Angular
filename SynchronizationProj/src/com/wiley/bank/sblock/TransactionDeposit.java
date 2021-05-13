package com.wiley.bank.sblock;

class TransactionDeposit implements Runnable{
	int amount;
	Account accountX;
	
	TransactionDeposit(Account x, int amount){
		accountX = x;
		this.amount = amount;
		new Thread(this).start();
	}
	
	public void run(){
		// line of code  before synch best pattern 
		synchronized(accountX)
		{
			accountX.deposit(amount);
		}
		// line of code after synch 
	}
}