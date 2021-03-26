
public class Series {
	private String seasons;
	private String episodes;
	private User user;
	private Media media;
	public Series() {
		//this("S1","E1");
	}
	public Series(User user, String seasons, String episodes) {
		//super();
		this.user=user;
		this.seasons = seasons;
		this.episodes = episodes;
	}
	
	//@Override
	public void play() throws SubscriptionException, AgeRestrictionException {
		if(user.getSubscription()!=null ) {
			media.play(user);
			System.out.println("Streaming Season:"+seasons+"Episode: "+episodes);
		}
		else {
			throw new SubscriptionException("You're not subscribed.");
		}
	}
}

