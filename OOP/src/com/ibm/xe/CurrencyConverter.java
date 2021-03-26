package com.ibm.xe;

public class CurrencyConverter {
	public double converter(Currency source,Currency target,double amount) {
		double rate = target.dollarValue()/source.dollarValue();
		return rate*amount;		
		
		
	}
}
