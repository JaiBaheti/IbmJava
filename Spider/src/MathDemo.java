
interface Math{
	int max(int a ,int b);
}
public class MathDemo {
	public static void main(String[] args) {
		Math m1= (x, y)->{
			if(x>y)
				return x;
			else
				return y;
		};
		System.out.println(m1.max(10,20));
		
		//Math m2=(m,n)->{if(m>n)?m:n;};
	}

}
