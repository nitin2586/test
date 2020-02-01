package com.test;

import java.util.ArrayList;
import java.util.List;

public class ABC {
	public static void main(String[] args) {
		System.out.println("ABC");
		List<Integer> ns=new ArrayList<Integer>();
		ns.add(10);
		ns.add(1);
		ns.add(5);
		ns.add(15);
		ns.add(8);
		ns.forEach(number->{
			System.out.println("number "+number);
		});
		
	}
}
