package com.mystore.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class landingPage {
	
	WebDriver ldriver;
	
	public landingPage(WebDriver rdriver)
	{
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(linkText="Signup / Login")
	WebElement mainpagesignIn;
	
	public void clickonSignin()
	{
		mainpagesignIn.click();
	}
}
