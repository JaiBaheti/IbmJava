

public class Customer {
	private int custId;
	private String custName;
	private double credLimit;
	private static int autogen;
	
	static {
		autogen=1001;
	}
	public Customer(String custName, double credLimit) {
		super();
		this.custId = autogen++;
		this.custName = custName;
		this.credLimit = credLimit;
	}
	
	public void printCust() {
		System.out.println("CustId: "+custId);
		System.out.println("CustName: "+custName);
		System.out.println("Credit Limit: "+credLimit);
	}
}
