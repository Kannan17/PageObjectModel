package com.webapp.wgreen.pom.util;

public class WGconstants {
	
	//Path
	public static final String CHROME_DRIVER_EXE="C:\\WGworkspace\\"+"chromedriver.exe";

	
	//URLs
	public static final String URL="https://www.walgreens.com/login.jsp";
	
	
	//Locator
	public static final String USER_NAME = "signin-username";

	public static final String PASSWORD = "signin-password";

	public static final String SIGN_IN_BUTTON = "wag-newlogin-signin";

	public static final String MYACCOUNT = "//*[@id='wag-youraccount-infomob']/a/span";


	public static final String ACCOUNT_HOME = "//*[@id='yourAccMList']/li[1]/a";


	public static final String REPORT_PATH = "C:\\WGworkspace\\";


	public static final String USER_NAME_ALTER = "userName-phoneNo";


	public static final String CONTINUE_BUTTON = "continueBtn";


	public static final String ALTERNATE_PASSWORD = "password";


	//public static final String ALTER_SIGN_IN_BUTTON = "//*[class='mb10']/button[1]";
	public static final String ALTER_SIGN_IN_BUTTON = "//*[@id='passwordlessLoginContainer']/section[3]/section[2]/section[1]/section/section/section[3]/section[3]/button";
	
	//public static final String ALTER_SIGN_IN_BUTTON = "//*[@id='passwordlessLoginContainer']/section[3]/section[2]/section[1]/section/section/section[3]/section[3]/button";

	//public static final String ALTER_SIGN_IN_BUTTON = "//button[text()='Sign In']";
	//public static final String ALTER_SIGN_IN_BUTTON = "//button[contains(.,'Sign In')]";
	
	public static final String My_ACCOUNT = "//*[@id='wag-body-main-container']/section[1]/h1";
	public static final String My_ACCOUNT_TEXT ="Your Account";


	public static final String HEALTH_INFO_SERVICES = "//*[@id='wag-header-mobile-slider']/nav/ul/li[4]/section/a[1]";


	public static final String YOUR_HEALTH_DASHBOARD = 	"//*[@id='wag-header-mobile-slider']/nav/ul/li[4]/ul/li[2]";


	//public static final String CONTACT_LENSES = "//a[text()='Contact Lenses']";
	
	//public static final String CONTACT_LENSES = "//*[@id='wag-header-mobile-slider']/nav/ul/li[5]/section/a[1]";
	//public static final String CONTACT_LENSES = "//span[text()='Contact Lenses']";
	
//	public static final String CONTACT_LENSES = "//li[@class='nav3 accordin-main contactlense']/section/a";
	//public static final String CONTACT_LENSES = "//*[@class='nav3 accordin-main contactlense']";
	
	public static final String CONTACT_LENSES = "//a[@href='/store/c/contact-lenses/ID=359432-tier2clense']";


	public static final String SEARCH_BOX ="ntt-placeholder";


	public static final String SEARCH_BUTTON = "header-search";


	public static final String TEXT_ON_IMAGE = "//img[@alt='Acuvue Oasys For Astigmatism']";



	public static final String R_CYLINDER = "rCylinder";


	public static final String R_POWER = "rPower";


	public static final String R_AXIS = "rAxis";


	public static final String L_POWER = "lPower";


	public static final String L_CYLINDER = "lCylinder";


	public static final String L_AXIS = "lAxis";


	public static final String ADD_TO_CART = "add-cart";


	public static final String FEEDBACK_ALERT = "//a[text()='No, thanks']";
											
}
