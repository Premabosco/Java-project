package com.student.org;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;

public class Boy {
	public void girlName() {
		System.out.println("Jaya");
	}
	public static void main(String[] args) {
		/*Boy b = new Boy ();
		b.girlName();*/
		Integer[] a = {4,2,0,8};
		  List asList = Arrays.asList(a);
		List<Integer> list=new ArrayList<Integer>(asList);
		System.out.println(list);
		Collections.sort(list);
		System.out.println(list);
	}

	}


