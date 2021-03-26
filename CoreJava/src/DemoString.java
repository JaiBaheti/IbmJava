
public class DemoString {
	public static void main(String[] args) {
		String s1="Hello";
		String s2 =new String("Hello");
		String s3= "Hello";
		System.out.println(s1==s2);
		System.out.println(s1==s3);
		
		
		System.out.println(s1.length());
		System.out.println(s1.indexOf("H"));
		System.out.println(s1.lastIndexOf("o"));
		System.out.println(s1.charAt(2));
		
		System.out.println(s1.substring(3));
		System.out.println(s1.substring(3,5));
		System.out.println(s1.replace('o','a'));
		
		System.out.println(s1);
		
		String week="Sun-Mon-Tue-Wed-Thu-Fri-Sat";
		String[] we =week.split("-");
		for(int i=0;i<we.length;i++)
			System.out.println(we[i]);
		
	}
}
