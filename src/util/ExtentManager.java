package com.webapp.wgreen.pom.util;

import java.io.File;
import java.util.Date;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.DisplayOrder;
import com.relevantcodes.extentreports.ExtentReports;

public class ExtentManager {

	private static ExtentReports extent;
	@Test
	public static ExtentReports  getInstance()
	{
		if (extent==null)
		{
			System.out.println("!!!!!!!!!!!!!!!!!!");
		Date d=new Date();
		String filename=d.toString().replace(":", "_").replace(" ", "_")+".html";
		System.out.println(filename);
		String path=WGconstants.REPORT_PATH+filename;
		System.out.println("path "+path);
		extent= new ExtentReports(path,true,DisplayOrder.NEWEST_FIRST);
		extent.loadConfig(new File(System.getProperty("user.dir")+"\\ReportsConfig.xml"));
		}
		System.out.println("$$$$$$$$$$$$$$$$$$$$$");
		return extent;
		
	}


}
