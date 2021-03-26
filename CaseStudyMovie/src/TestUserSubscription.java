
public class TestUserSubscription {

	public static void main(String[] args) throws SubscriptionException, AgeRestrictionException {
		// TODO Auto-generated method stub
		User u1= new User("XYZ",12,"M",150);
		User u2 = new User("QWE",21,"F",500);
		User u3 = new User("QAZ",60,"F",5000);
		User u4 = new User("WER",24,"M",780);
		
		//Movie m1= new Movie();
				
		Media m1 = MovieFactory.play("GOT", "Horror", false);
		Media m2 = MovieFactory.play("Breaking Bad","Action",false);
		Media m3 = MovieFactory.play("Shameless","Erotic", false);
	
		m1.play(u1);
		//Media.play(u1);
		
		
		//System.out.println(u1.getSubscription());
		Subscription s = MovieFactory.subscriber(u1, "monthly");
		s.subscriber();
		Series s1 = MovieFactory.play(u1, "1", "1");
		s1.play();
		
		
		
		
	}

}
