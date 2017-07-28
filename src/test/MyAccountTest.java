package com.webapp.wgreen.pom.testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import com.webapp.wgreen.pom.testcases.basetest.BaseTest;
import com.webapp.wgreen.pom.pages.LaunchPage;
import com.webapp.wgreen.pom.pages.LoginPage;
import com.webapp.wgreen.pom.pages.session.LandingPage;
import com.webapp.wgreen.pom.pages.session.MyAccountPage;
import com.webapp.wgreen.pom.util.ExtentManager;
import com.webapp.wgreen.pom.util.WGconstants;

public class MyAccountTest extends BaseTest {
	@Test
	public void accountTest() throws InterruptedException{
		
		
		test=extent.startTest("MyAccountTest");
		test.log(LogStatus.INFO, "Test Started");
	init();			
//	PageFactory.initElements(driver, LaunchPage.class);
	//LaunchPage lp= PageFactory.initElements(driver, LaunchPage.class);
	LaunchPage launchPage= new LaunchPage(driver,test);
	PageFactory.initElements(driver, launchPage);
	LoginPage loginPage=launchPage.gotoLoginPage();
	
	//
	Object page=loginPage.doLogin("vadugai.kannan@gmail.com", "chennai2017");
	if (page instanceof LoginPage)
		Assert.fail("Login Failed");
	else if (page instanceof LandingPage)
		System.out.println("Login is successfull");
		LandingPage landingPage=(LandingPage) page;
	
	MyAccountPage myAccountPage=landingPage.clickonMyaccount();
	
	boolean b=myAccountPage.verifyText(WGconstants.My_ACCOUNT,WGconstants.My_ACCOUNT_TEXT);
	if (b==true)
	{
		System.out.println("MyAccount Test is Pass");
		test.log(LogStatus.PASS, "MyAccount Test is Pass");
			}
	else 
	{
		System.out.println("MyAccount Test is Fail");
		test.log(LogStatus.FAIL, "MyAccount Test is Fail");
	}
	
	
	

	
	}
	
	@AfterMethod
	public void quit()
	{
		extent.endTest(test);
		extent.flush();
		
	}
	
	
	

}
