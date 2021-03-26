import com.ibm.stock.Broker;
import com.ibm.stock.Exchange;
import com.ibm.stock.Holder;
import com.ibm.stock.Stock;
import com.ibm.stock.StockSingleton;

public class TestStock {
	public static void main(String[] args) {
		Holder h=StockSingleton.getStock();
		h.view();
		
		Exchange e = StockSingleton.getStock();
		e.set();
		
		Broker b = StockSingleton.getStock();
		b.get();
		System.out.println(h==e);
		
	}
}
