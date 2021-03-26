import com.ibm.emp.Employee;
import com.ibm.emp.Executive;
import com.ibm.emp.Manager;

public class TestEmp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp = new Employee(101, "Suresh", 1220);
		emp.payslip();
		Manager m = new Manager(102, "Ramesh", 1220,1234);
		m.payslip();
		System.out.println(m.getSalary());
		
		
		Executive exe = new Executive(103,"Ramesh",1220,330);
		exe.payslip();
		
		
		showSalary(m);
		showSalary(exe);
		
	}
	private static void showSalary(Employee emp) {
		if (emp instanceof Manager)
			System.out.println("Manager Salary:: "+emp.getSalary());
		else
			System.out.println("Executive Salary:: "+emp.getSalary());
	}
	
}
