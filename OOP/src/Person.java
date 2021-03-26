
public class Person {
	private String name;
	private int age;	
	public Person() {
		// TODO Auto-generated constructor stub
		this("Anonymous",-1);
	}
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public void setName(String name, int age) {
		this.name= name;
		this.age= age;
		
	}
	public void print() {
		System.out.println("Name: "+name+"\t Age: "+age);
	}
	
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if(obj instanceof Person) {
			Person p =(Person) obj;
			if(p.name.equals(this.name) && p.age==(this.age))
				return  true;
		}
		return false;
	}
	
	@Override
	public void finalize() throws Throwable {
		// TODO Auto-generated method stub
		//super.finalize();
		System.out.println("No More");
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	public static void main(String[] args) {
		Person pw = null;
		for(int i=0;i<5;i++) {
			pw=new Person();
		}
		System.gc();
		
		
		//Person p =new Person();
	//	Person p1 = new Person();
		//p.setName("Jai", 12);
		//System.out.println(p.hashCode());
	//	System.out.println(p.equals(p1));
		//p.print();
		
	}
	
}
