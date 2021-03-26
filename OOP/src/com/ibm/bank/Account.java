package com.ibm.bank;
/**
 * 
 * @author JaiBaheti
 *@version 1.0
 */
public abstract class Account implements Banking{
	private int actNo;
	private String accHolder;
	public double balance;
	private static int autogen;
	protected Transaction[] tran;
	protected int idx;
	
	/*Static */
	static {
		autogen=1001;
	}
	/** Parametrised Constructor*/
	public Account(String accHolder, double balance) {
		super();
		this.actNo = autogen++;
		this.accHolder = accHolder;
		this.balance = balance;
		
		tran = new Transaction[5];
		tran[idx ++] =  new Transaction("OB", balance, balance);
		
	}
	
	public double getBalance() {
		return balance;
	}

	public void summary() {
		System.out.println("Account no. "+actNo);
		System.out.println("Account holder: "+accHolder);
		System.out.println("Balance: "+balance);
		
	}
	public void deposit(double amount) {
		balance+=amount;
		tran[idx ++] = new Transaction("CR", amount, balance);
	}
	public abstract void withdraw(double amount) throws BankingException;
	
	public void statement() {
		System.out.println("Statement of a/c no:: "+actNo);
		for(int i=0;i<idx;i++) {
			tran[i].print();
		}
		System.out.println();
	}
}
