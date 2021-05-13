package com.wiley.bank;
class Account {
	
	public int balance;
	public int accountNo;
	void displayBalance() {
		System.out.println("Account No: " + accountNo + "\nBalance: " + balance);
	}

	   synchronized void deposit(int amount){
		   
		   System.out.println(Thread.currentThread()+"has locked Account object");
			balance = balance + amount;
			System.out.println( amount + " is deposited");
			displayBalance();
			System.out.println(Thread.currentThread()+"has released Account object");
	   }

	   synchronized  void withdraw(int amount){
	    	 if(amount<balance)
	    		 balance = balance - amount;
	    	 else
	    	 {
	    		 System.out.println("Amount is higher than available balance ..");
	    		 return;
	    	 }
			  System.out.println( amount + " is withdrawn");
			  displayBalance();
	   }
}

// t1 --> lock on account will restrict t2 to access synchronized method [not non-synchronized]