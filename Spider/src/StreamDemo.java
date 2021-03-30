import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamDemo {
	public static void main(String[] args) {
		Integer[] ar = {2,5,7,9,9};
		List<Integer> ls = Arrays.asList(ar);
		//ls.forEach(System.out::println);
		
		Stream<Integer> str1 = ls.stream().distinct();
		//str1.forEach(System.out::println);
		
		Stream<Integer> str2 = ls.stream().filter(n->n>=5);
		str2.forEach(System.out::println);
		
		//ls.stream().forEach(System.out::print);
		System.out.println(ls.stream().mapToInt(Integer::intValue).sum());//.System.out.print();
		System.out.println(ls.stream().reduce(0,(a,b)->a+b));
		
	}
}
