package com.mystore.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class accountCreatedPage {

WebDriver ldriver;
	
	public accountCreatedPage(WebDriver rdriver)
	{
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(css="h2[data-qa='account-created'] b")
	WebElement confirmMessage;
	
	@FindBy(css="a[data-qa='continue-button']")
	WebElement continueBtn;
	
	public String getConMessage()
	{
		String txt= confirmMessage.getText();
		return(txt);
	}
	
	public void clickonContinue()
	{
		continueBtn.click();
	}
	
}
