package com.mystore.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class newUserInfoPage {
WebDriver ldriver;
	
	public newUserInfoPage(WebDriver rdriver)
	{
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(id="id_gender1")
	WebElement salutaionMr;
	
	@FindBy(id="name")
	WebElement newUserName;
	
	@FindBy(id="email")
	WebElement newUserEmail;
	
	@FindBy(id="password")
	WebElement newPassword;
	
	@FindBy(id="first_name")
	WebElement newFirstName;
	
	@FindBy(id="last_name")
	WebElement newLastName;
	
	@FindBy(id="address1")
	WebElement Address1;
	
	@FindBy(id="country")
	WebElement country;
	
	@FindBy(id="state")
	WebElement state;
	
	@FindBy(id="city")
	WebElement city;
	
	@FindBy(id="zipcode")
	WebElement zipcode;

	@FindBy(id="mobile_number")
	WebElement mobNumber;
	
	@FindBy(css="button[data-qa='create-account']")
	WebElement createBtn;
	
	public void selectSalutaion()
	{
		salutaionMr.click();
	}
	
	public void enterNewPswrd(String Npswrd)
	{
		newPassword.sendKeys(Npswrd);
	}
	
	public void enterNewFname(String NFname)
	{
		newFirstName.sendKeys(NFname);
	}
	
	public void enterNewLname(String NLname)
	{
		newLastName.sendKeys(NLname);
	}
	
	public void enteraddress1(String address)
	{
		Address1.sendKeys(address);
	}
	
	public void selectCountry(String text)
	{
		Select obj = new Select(country);
		obj.selectByVisibleText(text);
	}
	
	public void enterstate(String Nstate)
	{
		state.sendKeys(Nstate);
	}
	
	public void enterCity(String Ncity)
	{
		city.sendKeys(Ncity);
	}
	
	public void enterZipcode(String Nzipcode)
	{
		zipcode.sendKeys(Nzipcode);
	}
	
	public void enterMobnum(String Mobnumb)
	{
		mobNumber.sendKeys(Mobnumb);
	}
	
	public void clickCreateBtn()
	{
		createBtn.click();
	}
}
