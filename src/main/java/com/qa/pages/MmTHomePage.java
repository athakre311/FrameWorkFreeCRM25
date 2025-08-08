package com.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MmTHomePage {
	
	WebDriver driver;
	
	@FindBy(xpath = "//span[@data-cy='closeModal']")
	WebElement ele1;
	
	
	@FindBy(xpath = "//p[@data-cy='LoginHeaderText']")
	WebElement loginOption;
	

	public MmTHomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	public void ele1() {
		ele1.click();
	}
	
	public void loginOption() {
		loginOption.click();
	}

}
