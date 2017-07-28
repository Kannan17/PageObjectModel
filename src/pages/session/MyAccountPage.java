package com.webapp.wgreen.pom.pages.session;

import org.openqa.selenium.WebDriver;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.relevantcodes.extentreports.ExtentTest;
import com.webapp.wgreen.pom.base.BasePage;
import com.webapp.wgreen.pom.util.WGconstants;

public class MyAccountPage extends BasePage {
	

@FindBy(id=WGconstants.My_ACCOUNT)
public WebElement Myaccount;

@FindBy(linkText=WGconstants.My_ACCOUNT_TEXT)
public String MyAccounTtext;


	
	
	public MyAccountPage(WebDriver driver, ExtentTest test)
	{
		//this.driver=driver;
		super(driver, test);
	}


	
}
