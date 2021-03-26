
public class User {
	private String name;
	private int age;
	private String gender;
	private double balance;
	private Subscription subscribed;
	private String profile;
	private String subscription;
	public User(String name, int age, String gender, double balance) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.balance = balance;	
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public String getProfile() {
		return profile;
	}
	public void setProfile(String profile) {
		this.profile = profile;
	}
	public String getSubscription() {
		return subscription;
	}
	public void setSubscription(String subscription) {
		this.subscription = subscription;
	}	
}
