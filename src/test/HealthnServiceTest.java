package com.webapp.wgreen.pom.testcases;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;
import com.webapp.wgreen.pom.pages.LaunchPage;
import com.webapp.wgreen.pom.pages.LoginPage;
import com.webapp.wgreen.pom.pages.common.TopMenu;
import com.webapp.wgreen.pom.pages.healthandservice.HealthnService;
import com.webapp.wgreen.pom.pages.session.LandingPage;
import com.webapp.wgreen.pom.testcases.basetest.BaseTest;
import com.webapp.wgreen.pom.util.WGconstants;

import java.util.concurrent.TimeUnit;



public class HealthnServiceTest extends BaseTest {

	Object page=null;
	
@Test
public void addtoCart() throws InterruptedException { 

	test=extent.startTest("Your Health Test");
	test.log(LogStatus.INFO, "Test Started");
init();			
//PageFactory.initElements(driver, LaunchPage.class);
//LaunchPage lp= PageFactory.initElements(driver, LaunchPage.class);
LaunchPage launchPage= new LaunchPage(driver,test);
PageFactory.initElements(driver, launchPage);
LoginPage loginPage=launchPage.gotoLoginPage();

//
	page=loginPage.doLogin("vadugai.kannan@gmail.com", "chennai2017");
if (page instanceof LoginPage)
	Assert.fail("Login Failed");
else if (page instanceof LandingPage)
	System.out.println("Login is successfull");
	LandingPage landingPage=(LandingPage) page;
	
	TopMenu top= new TopMenu(driver,test);
	PageFactory.initElements(driver, top);
	Thread.sleep(5000);
	page=top.healthInfoService();
	
	HealthnService healthnService=(HealthnService) page;
	
	
	
	
	
}


@AfterMethod
public void quit()
{
	extent.endTest(test);
	extent.flush();
	
}


}
