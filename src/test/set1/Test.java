package com.webapp.wgreen.pom.testcases.set1;

import java.util.ArrayList;

public class Test {

	
	Test test;
	ArrayList al;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Test test=new Test();
		
		Test1 test1=new Test1();
		test1.vadugai(test);

		
		
		
	}
	
	
	void chenni()
	{
		String s="Test";
		System.out.println(s);
		
		
		al= new ArrayList();
		System.out.println( al.size());
		al.add("Test");
		al.add("Test1");
		al.add("Test2");
		System.out.println( al.size());
		System.out.println( al);
		System.out.println( al.get(0));
		al.remove(2);
		
		System.out.println( al.size());
		System.out.println( al);
		
		
	}
	
	
	void assigntest(){
		System.out.println("Test");
	}
	
	

}
