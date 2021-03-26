import java.util.Scanner;

public class ScannerDemo {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		String ss= sc.next();
		System.out.println(ss);
		
		String pattern = "[A-Z][a-z]{3,}";
		System.out.println("Your name is "+(ss.matches(pattern)?"Valid":"Invalid"));
		
		System.out.println("Mobile Number: ");
		String mobile = sc.next();
		
		String mPattern = "[7-9][0-9]{9}";
		System.out.println("Mobile number is "+(mobile.matches(mPattern)?"Valid":"invalid"));
	
		System.out.println("Age::");
		String age = sc.next();
		String mAge="[0-9]{2}";
		System.out.println("Age is "+(age.matches(mAge)?"Valid":"Invalid"));
	}
}
