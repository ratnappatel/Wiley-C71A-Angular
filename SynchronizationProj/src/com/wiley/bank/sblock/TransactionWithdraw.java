package com.wiley.bank.sblock;

class TransactionWithdraw implements Runnable{
	int amount;
	Account accountY;
	
	TransactionWithdraw(Account y, int amount) {
		accountY = y;
		this.amount = amount;
		new Thread(this).start();
	}
	
	public void run(){
		synchronized(accountY)
		{
			accountY.withdraw(amount);
		}
	}
}
