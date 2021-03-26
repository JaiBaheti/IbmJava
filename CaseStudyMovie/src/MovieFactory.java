
public class MovieFactory {
	public MovieFactory() {
		
	}
	public static Subscription subscriber(User user,String plan) {
		return new Subscription(user,plan);
	}
	public static Series play(User user,String season, String episode) {
		return new Series(user, season, episode);
	}
	public static Media play(String title, String genre, boolean free) {
		return new Media(title, genre, free);
	}
}
