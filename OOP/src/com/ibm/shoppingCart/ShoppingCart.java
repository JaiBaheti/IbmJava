package com.ibm.shoppingCart;

public class ShoppingCart {
	private int idx;
	private double cartTotal;
	private Payment payment;
	private Product[] items;
	String[][] coupons = {{"Holidays","200"},{"AprilOff","300"},{"Weekend","200"}};
	
	public ShoppingCart() {
		items= new Product[5];
	}
	
	public void addProduct(Product p) throws OutOfStockException {
		if(idx<items.length) {
			items[idx++]= p;
			cartTotal+=p.getPrice()*p.getStock();
		}
		else {
			throw new OutOfStockException("Your cart is full.");
			//System.out.println("Your cart is full.");
		}
	}
	
	public void checkout(Payment pt,String cpn) throws PaymentDeclinedException {
		for(int i=0;i<idx;i++) {
			System.out.println("Item name:: "+items[i].getName()+" item price:: "+items[i].getPrice());
		}
		int cnt=0;
		for(int i=0;i<coupons.length;i++) {
			//System.out.println(coupons[i][1]);
			if(cpn == coupons[i][0]) {
				cartTotal-=Integer.parseInt(coupons[i][1]);
				cnt+=1;
			}
		}
		if(cnt==0) {
			System.out.println("Invalid Coupon");
		}
		
		System.out.println("Total price:"+cartTotal);
		
		//System.out.println("Enter card No.:: ");
		if(pt.getBalance()<cartTotal) {
			throw new PaymentDeclinedException("Insufficient Fund.");
		}
		
	}
}
