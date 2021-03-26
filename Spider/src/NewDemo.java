
public class NewDemo<J> {
	private J data;

	public NewDemo(J data) {
		super();
		this.data = data;
	}

	public J getData() {
		return data;
	}
	public void setData(J data) {
		this.data = data;
	}
	
	public static void main(String[] args) {
		NewDemo<String> dem = new NewDemo("Hey");
		//dem.setData(12);
		System.out.println(dem.getData());
		
		NewDemo<Integer>de = new NewDemo(123);
		System.out.println(de.getData());
	}
}
