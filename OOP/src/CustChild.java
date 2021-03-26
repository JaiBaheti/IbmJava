
public class CustChild extends Customer{
	private double discount;
	
	public CustChild(String custName, double credLimit,double discount) {
		super(custName, credLimit);
		this.discount=discount;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void printCust() {
		// TODO Auto-generated method stub
		super.printCust();
		System.out.println("Discount offfered: "+discount+"%");
	}
}
