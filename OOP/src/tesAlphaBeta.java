
public class tesAlphaBeta {
	public static void main(String[] args) {
		
	
		Alfa a = new Alfa();
		a.demo();
		
		Beta b = new Beta();
		b.test();
		
		///Alfa al = b;
		//al.demo();
		
		Beta be = (Beta) a;
		//be.test();
		be.demo();
	}
}
