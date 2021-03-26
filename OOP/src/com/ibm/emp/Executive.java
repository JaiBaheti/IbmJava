package com.ibm.emp;

public class Executive extends Employee{
	private double commision;
	
	public Executive(int empId, String empName, double salary,double commision) {
		super(empId, empName, salary);
		this.commision=commision;
		// TODO Auto-generated constructor stub
	}

	@Override
	public double getSalary() {
		// TODO Auto-generated method stub
		return super.getSalary()+commision;
	}

	@Override
	public void payslip() {
		// TODO Auto-generated method stub
		super.payslip();
		System.out.println("Commision: "+ commision);
	}
	
}
