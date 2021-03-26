
public interface Currency {
	double dollarValue();
	public static double convert(Currency source, Currency target, double amount) {
		double rate;
		rate = target.dollarValue()/source.dollarValue() * amount;
		return rate;
	}
	static Currency INR = ()->72.50;
	static Currency USD = ()->1.0;
	static Currency AED = ()->3.50;
}
class CurrencyDemo{
	public static void main(String[] args) {
		System.out.println(Currency.convert( Currency.USD,Currency.INR,100));
	}
}

