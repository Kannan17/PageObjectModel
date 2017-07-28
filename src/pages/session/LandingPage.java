package com.webapp.wgreen.pom.pages.session;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.relevantcodes.extentreports.ExtentTest;
import com.webapp.wgreen.pom.base.BasePage;
import com.webapp.wgreen.pom.pages.LoginPage;
import com.webapp.wgreen.pom.util.WGconstants;

public class LandingPage extends BasePage {


	
	@FindBy (xpath=WGconstants.MYACCOUNT)
	public WebElement Maccount;
	
	@FindBy (xpath=WGconstants.ACCOUNT_HOME)
	public WebElement AccountHome;
	
public LandingPage(WebDriver driver, ExtentTest test)
{
	//driver=this.driver;
	super(driver,test);
}
	
public MyAccountPage clickonMyaccount() throws InterruptedException
{System.out.println("11111111111");
	Thread.sleep(30000);
	System.out.println("222222222222");
	Maccount.click();
	Thread.sleep(10000);
	
	
	AccountHome.click();
	//click on My accounttory
//	return PageFactory.initElements(driver, MyAccountPage.class);
	MyAccountPage myAccountPage= new MyAccountPage(driver,test);
	PageFactory.initElements(driver, myAccountPage);
	return myAccountPage;
	
	
}

}
