@FunctionalInterface
public interface Hello {
	String sayHello();
	
	default void sayHalo() {
		System.out.println("Hola Monde");
	}
	static void sayH() {
		System.out.println("hey");
	}
}

class HeloDemo{    
	public static void main(String[] args) {
		Hello h =()->"Hello";
		System.out.println(h.sayHello());
		
		Hello h1 =()->{
			String msg = "HelloW";
			return msg;
		};
		System.out.println(h1.sayHello());
		
		h1.sayHalo();
		Hello.sayH();
	}
}