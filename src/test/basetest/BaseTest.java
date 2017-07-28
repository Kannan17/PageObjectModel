package com.webapp.wgreen.pom.testcases.basetest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import com.webapp.wgreen.pom.util.ExtentManager;
import com.webapp.wgreen.pom.util.WGconstants;

public class BaseTest {
	public WebDriver driver;
	public ExtentReports extent= ExtentManager.getInstance();
	public ExtentTest test;
	public void init()
	{
	
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", WGconstants.CHROME_DRIVER_EXE);
		driver = new ChromeDriver();
		test.log(LogStatus.INFO, "Driver Opened");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}



	
	
}
