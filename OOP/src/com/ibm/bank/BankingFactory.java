package com.ibm.bank;

public final class BankingFactory {
	private BankingFactory() {
	}
	
	public static Banking openSavingAccount(String holder) {
		return new Savings(holder,5000);
	}
	
	public static Banking openCurrentAccount(String holder) {
		return new Current(holder);
	}
}
