import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class Stream2Demo {
	public static void main(String[] args) {
		
	
		String[] star = {"Apple","Google","Oracle","IBM","Capgemini","Accenture"};
		List<String> input = Arrays.asList(star);
		input.forEach(System.out::println);
		
		System.out.println("------");
		input.stream().sorted().forEach(System.out::println);
		
		System.out.println("------");
		input.stream().map(str -> str.toUpperCase()).forEach(System.out::println);
		
		System.out.println("------");
		input.stream().filter(str->str.contains("App")).forEach(System.out::println);
		
		System.out.println("------");
		System.out.println(input.stream().filter(str->str.contains("p")).count());
		
		System.out.println("------");
		System.out.println(IntStream.range(1,99).count());
	}
	
	
}
