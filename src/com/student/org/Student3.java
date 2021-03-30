package com.student.org;

public class Student3 {
	public static void main(String[] args) {
		String s = "The cat on the wall";
		String[] x = s.split("");
		String[] y = s.split("",3);
		for (int i = 0; i < y.length; i++) {
			System.out.println(x[i]);
			for(String word2:y) {
				System.out.println(word2);
			}
			
				
			}
			
		}
	}


