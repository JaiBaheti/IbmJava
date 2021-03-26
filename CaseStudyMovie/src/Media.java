
public class Media {
	private String title;
	public static String userGenre;
	private String genre;//= {"Action", "Horror", "Erotic"};
	private boolean free;
	
	//public abstract void play(user);
	
	public Media(String title, String genre, boolean free) {
		super();
		this.title = title;
		this.genre = genre;
		this.free = free;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public boolean isFree() {
		return free;
	}
	public void setFree(boolean free) {
		this.free = free;
	}
	
	public void play(User user) throws AgeRestrictionException {
		//boolean cond= false;
		//System.out.println(user.getAge());
		if((user.getAge()<18 || user.getAge()>60)) {
			if(genre == "Horror")
				throw new AgeRestrictionException("Age below 18 aren't allowed to watch this movie.");
		}
		else {
			System.out.println("good to go");
		}		
		
	}
	
}
