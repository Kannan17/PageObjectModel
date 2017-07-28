package com.webapp.wgreen.pom.pages.session;

import java.util.Date;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.relevantcodes.extentreports.ExtentTest;
import com.webapp.wgreen.pom.base.BasePage;
import com.webapp.wgreen.pom.util.WGconstants;

public class SearchResultPage extends BasePage {
	
	@FindBy(xpath=WGconstants.TEXT_ON_IMAGE)
	public WebElement imageText;
	
	
	@FindBy(xpath=WGconstants.FEEDBACK_ALERT)
	public WebElement feedbackAlert;
	
	public SearchResultPage(WebDriver driver, ExtentTest test)
	{
		super(driver,test);
	}
	
	public Object selectLink()
	{
		
		try {
		wait.until(ExpectedConditions.visibilityOf(imageText));
		imageText.click();
				try{
						feedbackAlert.click();}
				catch (Exception e){System.out.println("feedbackAlert did not appear");}
			}
		
		catch(Exception e){
			
			//Create the filename of the screenshot
			Date date=new Date();
			System.out.println(date);
			
			
		}
		ProductPage productPage= new ProductPage(driver, test);
		PageFactory.initElements(driver, productPage);
		return productPage;
	
		
		
			
		
		
		
		
	}
	
	
	
	
}
