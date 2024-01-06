package com.mystore.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class afterloginPage {

	WebDriver ldriver;
	public afterloginPage(WebDriver rdriver)
	{
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(css="a b")
	WebElement loggedinUserName;
	
	public String getuserNamesignedIn()
	{
		String nametxt= loggedinUserName.getText();
		return(nametxt);
	}
}
