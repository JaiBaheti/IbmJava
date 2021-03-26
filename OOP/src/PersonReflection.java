import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class PersonReflection {
	public static void main(String[] args) throws ClassNotFoundException {
		
	
		//Class p =
		Class pc = Class.forName("Person");
		System.out.println(pc.getName());
		
		Constructor[] cc = pc.getConstructors();
		for(Constructor c:cc) {
			System.out.println(c);
		}
		
		Method[] met = pc.getMethods();
		for(Method m:met) {
			System.out.println(m);
		}
		System.out.println();
		Method[] met1 = pc.getDeclaredMethods();
		for(Method m:met1) {
			System.out.println(m);
		}
		
		Field[] fil = pc.getDeclaredFields();
		for(Field f:fil) {
			System.out.println(f);
		}
	}
}
