package com.mystore.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class accountPage {
WebDriver ldriver;
	
	public accountPage(WebDriver rdriver)
	{
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(name="name")
	WebElement newName;
	
	@FindBy(css=".signup-form input[name='email']")
	WebElement newEmail;
	
	@FindBy(css=".signup-form button")
	WebElement signUpBtn;
	
	@FindBy(css="input[data-qa='login-email']")
	WebElement extngEmail;
	
	@FindBy(name="password")
	WebElement extngPswrd;
	
	@FindBy(css="button[data-qa='login-button']")
	WebElement extngSigninBtn;
	
	public void enterNewName(String name)
	{
		newName.sendKeys(name);
	}
	
	public void enterNewEmail(String newusrEmail)
	{
		newEmail.sendKeys(newusrEmail);
	}
	
	public void clickSignUp()
	{
		signUpBtn.click();
	}
	
	//exting users
	public void enterExtngEmail(String exEmail)
	{
		extngEmail.sendKeys(exEmail);
	}
	
	public void enterExtngPswrd(String exPswrd)
	{
		extngPswrd.sendKeys(exPswrd);
	}
	
	public void clickSignIn()
	{
		extngSigninBtn.click();
	}
}
