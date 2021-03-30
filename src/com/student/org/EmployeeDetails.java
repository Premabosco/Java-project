package com.student.org;

public class EmployeeDetails extends Loan {
	@Override
	public void perloan() {
		
		super.perloan();
		System.out.println("30%");
	}
	public static void main(String[] args) {
		EmployeeDetails ed = new EmployeeDetails();
		ed.perloan();
	}

}
