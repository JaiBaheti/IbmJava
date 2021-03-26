
public class ChildDemo<J,A> extends NewDemo<J> {
	private A temp;
	
	public ChildDemo(J data, A temp) {
		super(data);
		this.temp = temp;
	}
	
	public A getTemp() {
		return temp;
	}
	public void setTemp(A temp) {
		this.temp = temp;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChildDemo <String,Integer> d = new ChildDemo("Hello", 100);
		System.out.println(d.getData() + d.getTemp());

	}

}
