package com.qa.testCases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.base.Base;
import com.qa.pages.MmTHomePage;

public class loginTest extends Base{
	
	
	WebDriver driver;
	MmTHomePage mmTHomePage;
	
	@BeforeMethod
	public void setup() {
		driver = initilizeBrowser();
		mmTHomePage = new MmTHomePage(driver);
	}
	
	@AfterMethod
	public void tearDown() {
		
	}

	@Test
	public void loginWithInvalidCredentials() {
		mmTHomePage.ele1();
		mmTHomePage.loginOption();
	}
}
