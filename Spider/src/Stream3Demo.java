import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Stream3Demo {
	public static void main(String[] args) {
		Map<String,String> people = new HashMap<String,String>();
		people.put("Polo","Mumbai");
		people.put("Sam", "Pune");
		people.put("Curran", "Banglore");
		
		people.values().stream().forEach(System.out::println);
		System.out.println("------");
		people.keySet().stream().forEach(System.out::println);
		//List<String> cities = people.values().stream().map();
	}
}
