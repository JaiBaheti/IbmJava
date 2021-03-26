package com.ibm.bank;

public class Savings extends Account {

	public Savings(String accHolder, double balance) {
		super(accHolder, balance);
		// TODO Auto-generated constructor stub
	}

	
	@Override
	public void withdraw(double amount) throws BankingException {
		// TODO Auto-generated method stub
		//double bal = super.getBalance();
		if(balance-amount>1000) {
			balance-=amount;
			tran[idx ++] = new Transaction("DR", amount, balance);
		}
			//super.withdraw(amount);
		else {
			throw new BankingException("Insufficient Balance");
			//System.out.println("Insufficient Balance");
		}
	}
	
}
