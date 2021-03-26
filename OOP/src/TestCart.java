import com.ibm.shoppingCart.*;

public class TestCart {
	public static void main(String[] args) throws OutOfStockException, PaymentDeclinedException {
		Product p = new Product("Books",1234, 2);
		Payment pay = new Payment("1234-5678-0912",1112300);
		ShoppingCart sc = new ShoppingCart();
		sc.addProduct(p);
		
		sc.addProduct(new Product("iWatch",56000, 2));
		sc.checkout(pay,"A");
		//sc.checkout(pay,"Holidays");
		
	}
}
