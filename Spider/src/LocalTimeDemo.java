import java.time.LocalTime;

public class LocalTimeDemo {
	public static void main(String[] args) {
		LocalTime lt = LocalTime.now();
		System.out.println(lt);
		
		LocalTime l1 = LocalTime.of(07, 03);
		System.out.println(l1);
		
		System.out.println(l1.plusHours(1));
		System.out.println(LocalTime.MAX);
	}
}
