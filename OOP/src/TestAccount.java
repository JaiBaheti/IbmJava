import com.ibm.bank.Banking;
import com.ibm.bank.BankingException;
import com.ibm.bank.BankingFactory;
import com.ibm.bank.Savings;

public class TestAccount {
	public static void main(String[] args) {
		
		//BankingFactory bf = new BankingFactory();
		Banking s = BankingFactory.openSavingAccount("Polo");
				
				//new Savings("Polo",5000);
		
		//s.deposit(10000);
		try {
			s.withdraw(4000);
		} catch (BankingException e) {
			System.out.println(e.getMessage());
			//System.out.println(e);
			//e.printStackTrace();
		}
		
		s.statement();
		
	}
}
