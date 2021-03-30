package com.student.org;

public class StudentDetails1 {
	public void std(int id) {
		System.out.println("student id is"+id);
	}
	public void std(String name) {
		System.out.println("student name is"+name);
	}
	public void std(char initial,String name) {
		System.out.println("std initial and name is"+initial+"."+name);
	}
	public static void main(String[] args) {
		StudentDetails1 sd = new StudentDetails1();
		sd.std(3);
		sd.std("Prema");
		sd.std('A',"Princy");
		
	}
}
		

	

	

	


