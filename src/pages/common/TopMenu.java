package com.webapp.wgreen.pom.pages.common;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.relevantcodes.extentreports.ExtentTest;
import com.webapp.wgreen.pom.pages.contactlensepages.ContactLenseHome;
import com.webapp.wgreen.pom.pages.healthandservice.HealthnService;
import com.webapp.wgreen.pom.pages.session.SearchResultPage;
import com.webapp.wgreen.pom.util.WGconstants;


public class TopMenu {
	
	
	@FindBy(xpath=WGconstants.HEALTH_INFO_SERVICES)
	public WebElement Healthinfoserv;
	
	
	@FindBy(xpath=WGconstants.YOUR_HEALTH_DASHBOARD)
	public WebElement Yourealthdashboard;
	
	
	@FindBy(xpath=WGconstants.CONTACT_LENSES)
	public WebElement contactlences;
	
	@FindBy(id=WGconstants.SEARCH_BOX)
	public WebElement search;
	
	@FindBy(id=WGconstants.SEARCH_BUTTON)
	public WebElement searchButton;
	

	

	

	
	public ExtentTest test;
	WebDriver driver;
	
	public TopMenu(WebDriver driver,ExtentTest test)
	{
		this.driver=driver;
		this.test=test;
	}
	public void logout()
	{
		System.out.println("logout script need to be written");
	}

	
	public Object search(String text)
	{
					
		search.sendKeys(text);
		searchButton.click();
		SearchResultPage searchResultPage= new SearchResultPage(driver, test);
		PageFactory.initElements(driver, searchResultPage);
		return searchResultPage;
						
	}
	
	
	
	
	public Object healthInfoService()
	{
		
	Healthinfoserv.click();
	HealthnService healthnService= new HealthnService(driver,test);
	PageFactory.initElements(driver, healthnService);
	return healthnService;	
		
		
	}
	
	public Object contactLencetab()
	{
		
	contactlences.click();
	ContactLenseHome contactlenseHome= new ContactLenseHome(driver,test);
	PageFactory.initElements(driver, contactlenseHome);
	return contactlenseHome;
				
	}

	
	
	
	
	
	
	
	
	
	
	
	
}
