package com.testing.samplecases;

import java.util.ArrayList;
import java.util.List;

public class TestClass1 {
	
	public static int i=1;

	public void method1() {
		System.out.println("Welcome to test case 1");
		if(i>10 && i< 99) {
			
		}else if(i> 100 && i < 200) {
			
		}
	}
	public void method2() {
		System.out.println("Welcome to test case 2");
		List<Integer> mylist = new ArrayList<Integer>();
		try {
			while(i>10) {
				mylist.get(i);
			}
		} catch (NullPointerException e) {
			throw new NullPointerException();
		}
	}
	public void method3() {
		System.out.println("Welcome to test case 3");
		while(i>10) {
			i += 1;
		}
	}
}
