import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public class Stream4Demo {
	public static void process(int i) {
		
	}
	public static void main(String[] args) {
		List<Integer> numbers = new ArrayList<Integer>();
		for(int n=1;n<1000;n++)
			numbers.add(n);
		
		long startTime = System.currentTimeMillis();
		numbers.stream().forEach(Stream4Demo::process);
		long endTime = System.currentTimeMillis();
		System.out.println("Time taken by Sequential stream:: "+(endTime- startTime));
		

		startTime = System.currentTimeMillis();
		numbers.parallelStream().forEach(Stream4Demo::process);
		endTime = System.currentTimeMillis();
		System.out.println("Time taken by Parallel stream:: "+(endTime- startTime));
		
		
		Map<String, String> person = new HashMap<String,String>();
		person.put("Hello", "Jai");
		person.put("Hey","Jai");
		startTime = System.currentTimeMillis();
		person.keySet().stream().forEach(System.out::println);
		endTime = System.currentTimeMillis();
		System.out.println("Time taken by Sequential stream:: "+(endTime- startTime));
		
		ConcurrentMap<String, String> person1= new ConcurrentHashMap<String,String>();
		person1.put("Hello", "Jai");
		person1.put("Hey","Jai");
		startTime = System.currentTimeMillis();
		person1.keySet().stream().forEach(System.out::println);
		endTime = System.currentTimeMillis();
		System.out.println("Time taken by Parallel stream:: "+(endTime- startTime));
		
	}
}
