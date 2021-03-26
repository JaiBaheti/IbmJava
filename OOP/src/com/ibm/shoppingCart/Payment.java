package com.ibm.shoppingCart;

public class Payment {
	private String cardNo;
	private double balance;
	public Payment(String cardNo, double balance) {
		super();
		this.cardNo = cardNo;
		this.balance = balance;
	}
	public String getCardNo() {
		return cardNo;
	}
	public void setCardNo(String cardNo) {
		this.cardNo = cardNo;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
}
