
public interface Event {
	void doSomething();
}	
	
class EventImp implements Event{
	@Override
	public void doSomething() {
		System.out.println("1st task");
	}
	class InnerEventImpl implements Event{
		@Override
		public void doSomething(){
			System.out.println("2nd task");
	}
	}	
	
	public void oneLastImp() {
		Event e = new Event () {
			public void doSomething() {
				System.out.println("4th");
			}
		};
		e.doSomething();
	}
	public void lastlastTime() {
		Event e = ()->System.out.println("5th");
		e.doSomething();
	}
	public static void main(String[] args) {
		EventImp ei = new EventImp();
		ei.doSomething();
		InnerEventImpl inner = ei.new InnerEventImpl();
		inner.doSomething();
		
		//EventImp.InnerEventImp inner = new EventImp.InnerEventImp();
		//inner.doSomething();
		
		//ei.oneMoreImp();
		ei.oneLastImp();		
		ei.lastlastTime();
	}
}
