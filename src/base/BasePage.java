package com.webapp.wgreen.pom.base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.relevantcodes.extentreports.ExtentTest;
import com.webapp.wgreen.pom.pages.common.TopMenu;

public class BasePage {
	public WebDriver driver;
	public ExtentTest test;
	public WebDriverWait wait;
	public BasePage()
	{}
	
	public BasePage(WebDriver driver, ExtentTest test)
	{
		this.driver=driver;
		this.test=test;
		TopMenu top=new TopMenu(driver,test);
		PageFactory.initElements(driver, top);
		wait= new WebDriverWait(driver, 15);
		
		
	}
	
	public void basePageinit()
	{
	
	}

	public boolean verifyText(String Locator, String ExpText){
		String s=driver.findElement(By.xpath(Locator)).getText().trim();
		if (s.equals(ExpText))
		return true;
		return false;
	}
	
	public boolean verifyPageTitle(String expText1)
	{
		System.out.println("expText1");
		return true;
	}
	
	
	
	
	

}
