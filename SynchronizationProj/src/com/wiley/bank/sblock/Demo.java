package com.wiley.bank.sblock;

public class Demo {
	public static void main(String args[]) {
		Account ABC = new Account();
		ABC.balance = 700;
		ABC.accountNo = 111;
		
		TransactionDeposit t1;
		TransactionWithdraw t2;
		
		t1 = new TransactionDeposit(ABC, 500);
		t2 = new TransactionWithdraw(ABC,900);
	}
}
