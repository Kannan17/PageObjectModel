package com.webapp.wgreen.pom.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import com.webapp.wgreen.pom.base.BasePage;
import com.webapp.wgreen.pom.util.WGconstants;

public class LaunchPage extends BasePage {
	

	
	public LaunchPage(WebDriver driver, ExtentTest test)
	{
		//this.driver=driver;
		super(driver,test);
	}

	public LoginPage gotoLoginPage(){
	
	driver.get(WGconstants.URL);
	test.log(LogStatus.INFO, "URL Entered");
	
	driver.findElement(By.xpath("//div/div/table[2]/tbody/tr/td/table[1]/tbody/tr[2]/td/a")).click();
	driver.findElement(By.xpath("//input[@value='I Accept']")).click();
	//click on Signin link
	LoginPage loginPage= new LoginPage(driver,test);
	PageFactory.initElements(driver, loginPage);
	test.log(LogStatus.INFO, "Login Page Object is Created");
	return loginPage;

	}
	
}
