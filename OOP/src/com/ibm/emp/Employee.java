package com.ibm.emp;

public class Employee {
	private int empId;
	private String empName;
	private double salary;
	
	public Employee(int empId, String empName, double salary) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.salary = salary;
	}
	
	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public void payslip() {
		System.out.println("EmpId: "+empId+"\tEmpName: "+empName+"\t salary: "+salary);
	}
	
}
