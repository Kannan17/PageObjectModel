package com.webapp.wgreen.pom.pages.session;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

import com.relevantcodes.extentreports.ExtentTest;
import com.webapp.wgreen.pom.base.BasePage;
import com.webapp.wgreen.pom.util.WGconstants;



public class ProductPage extends BasePage {
	
	
	

	@FindBy(id=WGconstants.R_POWER)
	public WebElement rpower;
	
	@FindBy(id=WGconstants.R_CYLINDER)
	public WebElement rCylinder;
	
	
	
	@FindBy(id=WGconstants.R_AXIS)
	public WebElement rAxis;
	
	
	@FindBy(id=WGconstants.L_POWER)
	public WebElement lPower;
	
	
	@FindBy(id=WGconstants.L_CYLINDER)
	public WebElement lCylinder;
	
	
	
	@FindBy(id=WGconstants.L_AXIS)
	public WebElement lAxis;
	
	
	@FindBy(id=WGconstants.ADD_TO_CART)
	public WebElement addtoCart;
	
	ProductPage(WebDriver driver, ExtentTest test)
	{
		super(driver, test);
	}
	
	
	public void selectElement()
	{
		//Selecting the Dropdown Right Power
		wait.until(ExpectedConditions.elementToBeClickable(rpower));
		WebElement wb1=rpower;
		Select sl1=new Select (wb1);
		sl1.selectByIndex(1);
				
		//Selecting the Dropdown Right Cylinder
		WebElement wb2=rCylinder;
		Select sl2=new Select (wb2);
		sl2.selectByIndex(1);
		
	//Selecting the Dropdown Right Axis	
		WebElement wb3=rAxis;
		Select sl3=new Select (wb3);
		sl3.selectByIndex(1);
		
		//Selecting the Dropdown Left Power
		
		WebElement wb4=lPower;
		Select sl4=new Select (wb4);
		sl4.selectByIndex(1);
						
		//Selecting the Dropdown Left Cylinder
		WebElement wb5=lCylinder;
		Select sl5=new Select (wb5);
		sl5.selectByIndex(1);
				
	//Selecting the Dropdown Left Axis	
		WebElement wb6=lAxis;
		Select sl6=new Select (wb6);
		sl6.selectByIndex(1);
		
		addtoCart.click();
		
		
		
	}
	

}
