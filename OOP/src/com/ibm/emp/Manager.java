package com.ibm.emp;

public class Manager extends Employee {
	private double incentives;	

	public double getIncentives() {
		return incentives;
	}

	public Manager(int empId, String empName, double salary,double incentives) {
		super(empId, empName, salary);
		this.incentives=incentives;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void payslip() {
		// TODO Auto-generated method stub
		super.payslip();
		System.out.println("Incentives: "+incentives);
		
	}

	@Override
	public double getSalary() {
		// TODO Auto-generated method stub
		return super.getSalary()+incentives;
	}

	
	
	
}
