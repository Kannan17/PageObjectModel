package com.webapp.wgreen.pom.testcases.set1;

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
import com.webapp.wgreen.pom.pages.LaunchPage;
import com.webapp.wgreen.pom.pages.LoginPage;
import com.webapp.wgreen.pom.pages.common.TopMenu;
import com.webapp.wgreen.pom.pages.session.LandingPage;
import com.webapp.wgreen.pom.pages.session.ProductPage;
import com.webapp.wgreen.pom.pages.session.SearchResultPage;
import com.webapp.wgreen.pom.testcases.basetest.BaseTest;
import com.webapp.wgreen.pom.util.ExtentManager;
import com.webapp.wgreen.pom.util.WGconstants;

public class AddtoCart extends BaseTest {
	Object page;/*
	public ExtentReports extent= ExtentManager.getInstance();
	public ExtentTest test;
	WebDriver driver;*/
	
	
	//AddtoCart(WebDriver driver, ExtentTest test)
	//{
	//	this.test=test;
	//	this.driver=driver;
	//}
	
	@Test
	public void AddtoCartTest() throws InterruptedException
	
	{
		
	/*	System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", WGconstants.CHROME_DRIVER_EXE);
		driver = new ChromeDriver();
		test.log(LogStatus.INFO, "Driver Opened");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);*/
		test=extent.startTest("AddtoCart Test staarted");
		test.log(LogStatus.INFO,"Test staarted");
		init();
	
		LaunchPage launchPage= new LaunchPage(driver, test);
		PageFactory.initElements(driver, launchPage);
		
		page=launchPage.gotoLoginPage();
		LoginPage loginPage=(LoginPage)page;
		
		
		page=loginPage.doLogin("vadugai.kannan@gmail.com", "chennai2017");
		if (page instanceof LoginPage)
			Assert.fail("Login Failed");
		else if (page instanceof LandingPage)
			System.out.println("Login is successfull");
		LandingPage landingpage= (LandingPage) page;
				
		TopMenu top=new TopMenu(driver, test );
		PageFactory.initElements(driver, top);
	page=top.search("Acuvue Oasys For Astigmatism");
	SearchResultPage searchResultPage =	(SearchResultPage) page;
	//Thread.sleep(3000);
	page=searchResultPage.selectLink();
	ProductPage productPage=(ProductPage) page;
	productPage.selectElement();
	
		
	
		
	}
	
	@AfterMethod
	public void quit()
	{
		extent.endTest(test);
		extent.flush();
		
	}
	

}
