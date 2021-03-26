import java.time.LocalDate;

public class LocalDateDemo {
	public static void main(String[] args) {
		LocalDate d = LocalDate.now();
		System.out.println(d);
		
		LocalDate d1 = LocalDate.of(2012, 02, 03);
		System.out.println(d1);
		
		LocalDate d2 = LocalDate.parse("2012-02-29");
		System.out.println(d2);
		
		System.out.println(d.plusDays(1));
		System.out.println(d.minusDays(1));
		System.out.println(d.withDayOfMonth(12));
	}
}
