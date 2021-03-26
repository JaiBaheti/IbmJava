import com.ibm.xe.CurrencyConverter;
import com.ibm.xe.INR;
import com.ibm.xe.USD;

public class TestCurrency {
	public static void main(String[] args) {
		INR in = new INR();
		USD us = new USD();
		CurrencyConverter cc = new CurrencyConverter();
		
		System.out.println(cc.converter(us, in,1));
	}
}
