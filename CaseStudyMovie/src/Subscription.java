import java.time.LocalDate;

public class Subscription {
	private User user;
	private String plan;//{{"Monthly","100"},{"Annually","1000"}};
	private LocalDate expiry;
	public Subscription(User user, String plan) {
		super();
		this.user = user;
		this.plan = plan;
		
	}
	public LocalDate getExpiry() {
		return expiry;
	}
	public void setExpiry(LocalDate expiry) {
		this.expiry = expiry;
	}
	
	public void subscriber() throws SubscriptionException {
		
		if(plan.equalsIgnoreCase("Monthly") && user.getBalance()<100) {
			throw new SubscriptionException("Insufficient Fund");
					//System.out.println("Insufficient fund");
		}
		else if(plan.equalsIgnoreCase("Monthly") && user.getBalance()>=100) {
			user.setSubscription(plan);
			//System.out.println("Hello");
			user.setBalance(user.getBalance()-100);
			expiry = LocalDate.now().plusMonths(1);
		}
		if(plan.equalsIgnoreCase("Annualy") && user.getBalance()<1000)	
			throw new SubscriptionException("no such subscription Available");
				//System.out.println("No such Subscription Available.");
		else if(plan.equalsIgnoreCase("Annualy") && user.getBalance()>=1000)	 {
			user.setSubscription(plan);
			user.setBalance(user.getBalance()-1000);
			expiry = LocalDate.now().plusYears(1);
		}
		
	}
}
