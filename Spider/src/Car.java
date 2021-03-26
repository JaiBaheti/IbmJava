public class Car {
	private String model;
	private String[] features;
	
	public Car(String model, String... features) {
		super();
		this.model = model;
		this.features = features;
	}
	
	public void specs() {
		System.out.println("Features of "+model);
		for(String f:features) {
			System.out.println(">"+f);
		}	System.out.println();	
	}
	
	public static void main(String[] args) {
		//String[] falto= {"ABC","ASD","QWE"};
		Car alto = new Car("XYZ","ABC","ASD","QWE");
		
		//String[] fhect = {"CC","QAZ"};
		Car hector = new Car("Hector","CC","QAZ");
		
		alto.specs();
		hector.specs();
	}
	
}
