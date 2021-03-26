
public class Demo {
	private Object data;
	
	public Demo(Object data) {
		this.data = data;
	}
	
	public Object getData() {
		return data;
	}
	public void setData(Object data) {
		this.data = data;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Object x = null;
		Demo dem = new Demo(x);
		x= "Data";
		
		dem.setData(x);
		System.out.println(dem.getData());		
	}

}
