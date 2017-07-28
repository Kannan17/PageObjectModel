package com.webapp.wgreen.pom.testcases.set1;



class Test4{  
	static int count=0;//will get memory only once and retain its value  
  
Test4(){  
count++;  
System.out.println(count);  
}  
  
public static void main(String args[]){  
  
	Test4 c1=new Test4();  
	Test4 c2=new Test4();  
	//Test4 c3=new Test4();   
  
 }  
}  