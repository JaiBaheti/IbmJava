package com.ibm.bank;

public class Current extends Account {
	private double overdraft = 0;
	public Current(String accHolder) {
		super(accHolder, 5000);
		//if (balance>=5000) {
			overdraft=10000;
		//}
		// TODO Auto-generated constructor stub
	}
	public void ovrd() {		
	}
	@Override
	public void deposit(double amount) {
		// TODO Auto-generated method stub
		overdraft+=amount;
		if(overdraft>10000) {
			balance+=overdraft-10000;
			overdraft=10000;
		}
		
	}
	public double getOverdraft() {
		return overdraft;
	}
	public void setOverdraft(double overdraft) {
		this.overdraft = overdraft;
	}
	@Override
	public void withdraw(double amount) throws BankingException {
			if(amount<=(balance+overdraft)) {
				balance-=amount;
				if(balance<0) {
					overdraft+=balance;
					balance=0;
				}
			}
			else {
				System.out.println("Insufficient Balance");
			}
	}	
}
