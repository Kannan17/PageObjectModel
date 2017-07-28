package com.webapp.wgreen.pom.testcases.set1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import org.testng.Assert;

public class Test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Test testing= new Test();
		Test1 testing1=new Test1();
		
		
		testing.assigntest();
		testing1.assigntest();
		htmltest();
			
		
		
	}

	
	
	static void htmltest()
	{
		StringBuilder contentBuilder = new StringBuilder();
		try {
		    BufferedReader in = new BufferedReader(new FileReader("D:\\P\\test.html"));
		    String str;
		    while ((str = in.readLine()) != null) {
		        contentBuilder.append(str);
		    }
		    in.close();
		} catch (IOException e) {
		}
		String str="zzz";
		String content = contentBuilder.toString();
System.out.println(content.contains("My First Heading"));
System.out.println(content.indexOf("DOC"));

try
{
    String filename= "D:\\P\\test.html";
    FileWriter fw = new FileWriter(filename,true); //the true will append the new data
    fw.write("**add a line\n");//appends the string to the file
   // fw.append("s").
    fw.close();
}
catch(IOException ioe)
{
    System.err.println("IOException: " + ioe.getMessage());
    Assert.fail();
}
}



	}
	
	

