package com.webapp.wgreen.pom.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import com.webapp.wgreen.pom.base.BasePage;
import com.webapp.wgreen.pom.pages.session.LandingPage;
import com.webapp.wgreen.pom.util.WGconstants;

public class LoginPage extends BasePage {
	
	
	

	@FindBy(id=WGconstants.USER_NAME)
	public WebElement Email;
	
	@FindBy(id=WGconstants.USER_NAME_ALTER)
	public WebElement EmailAlter;
	
	@FindBy(id=WGconstants.CONTINUE_BUTTON)
	public WebElement Continue;
	
	
	
	@FindBy(id=WGconstants.PASSWORD)
	public WebElement Password;
	
	@FindBy(id=WGconstants.ALTERNATE_PASSWORD)
	public WebElement PasswordAlternate;
	
	@FindBy (xpath=WGconstants.ALTER_SIGN_IN_BUTTON)
	public WebElement AlterSignin;
	
	@FindBy (id=WGconstants.SIGN_IN_BUTTON)
	public WebElement Signin;
	
	public LoginPage(WebDriver driver, ExtentTest test)
	{
		//this.driver=driver;
		super(driver,test);
	}

	
	public Object doLogin(String uName, String password) throws InterruptedException
	{
		
		boolean b=false;
		if ( Email.isDisplayed())
		{
			
	Email.sendKeys(uName);
	test.log(LogStatus.INFO, "UserName Entered");
	Password.sendKeys(password);
	test.log(LogStatus.INFO, "Password Entered");
	Signin.click();
		test.log(LogStatus.INFO, "Clicked on Signin Button");	
		b=true;
		}
		
		else if (EmailAlter.isDisplayed()){
			EmailAlter.sendKeys(uName);
			test.log(LogStatus.INFO, "UserName Entered in Alternate field");
			Continue.click();
			test.log(LogStatus.INFO, "Continue button is clicked");
			PasswordAlternate.sendKeys(password);
			test.log(LogStatus.INFO, "Password is Entered in Alternate field");
			Thread.sleep(5000);
			AlterSignin.click();
			test.log(LogStatus.INFO, "Clicked on Alternate Singnin button");
			b=true;
			
		}
			
			
	
	if(b==true)	{
		LandingPage landingPage= new LandingPage(driver,test);
		PageFactory.initElements(driver, landingPage);
	return landingPage;}
	else
	{
		LoginPage loginPage= new LoginPage(driver,test);
		PageFactory.initElements(driver, loginPage);
		return loginPage;}
		
	
	}

}
