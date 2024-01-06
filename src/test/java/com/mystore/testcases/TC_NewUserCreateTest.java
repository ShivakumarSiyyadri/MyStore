package com.mystore.testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.mystore.pageobjects.accountCreatedPage;
import com.mystore.pageobjects.accountPage;
import com.mystore.pageobjects.afterloginPage;
import com.mystore.pageobjects.landingPage;
import com.mystore.pageobjects.newUserInfoPage;

public class TC_NewUserCreateTest extends BaseClass {
	
	@Test(enabled=false)
	public void verifyUserReglogin()
	{
		landingPage lpg = new landingPage(driver);
		lpg.clickonSignin();
		logger.info("clicked on signin link");
		accountPage apg = new accountPage(driver);
		apg.enterNewName("Lokesh111");
		logger.info("entered new Name");
		apg.enterNewEmail("Lokes111@gmail.com");
		logger.info("entered new email");
		apg.clickSignUp();
		logger.info("clicked on signup button");
		
		newUserInfoPage newUsrPg = new newUserInfoPage(driver);
		
		newUsrPg.selectSalutaion();
		newUsrPg.enterNewPswrd("Lokesh@134");
		newUsrPg.enterNewFname("Lokesh111");
		newUsrPg.enterNewLname("S");
		newUsrPg.enteraddress1("123/123");
		newUsrPg.selectCountry("Canada");
		newUsrPg.enterstate("Gujarat");
		newUsrPg.enterCity("Delhi");
		newUsrPg.enterZipcode("100001");
		newUsrPg.enterMobnum("1234567890");
		logger.info("entered user details fields");
		newUsrPg.clickCreateBtn();
		logger.info("clicked on create account button");
		
		accountCreatedPage acCrtPg = new accountCreatedPage(driver);
		String mesage = acCrtPg.getConMessage();
		Assert.assertEquals("ACCOUNT CREATED!",mesage);
		
		logger.info("Account Created Message verified");
		acCrtPg.clickonContinue();
		
		afterloginPage aftrlogin = new afterloginPage(driver);
		String username = aftrlogin.getuserNamesignedIn();
		Assert.assertEquals("Lokesh111",username);
		
	}
	
		@Test
		public void verifyLogin() throws IOException
		{
			landingPage lpg = new landingPage(driver);
			lpg.clickonSignin();
			logger.info("clicked on signin link");
			accountPage apg = new accountPage(driver);
			apg.enterExtngEmail("Lokes111@gmail.com");
			apg.enterExtngPswrd("Lokesh@134");
			logger.info("entered existing email and pswrd");
			apg.clickSignIn();
			logger.info("clicked on logIn button");
			afterloginPage aftrlogin = new afterloginPage(driver);
			String username = aftrlogin.getuserNamesignedIn();
			if(username.equals("Lokesh111"))
			{
				logger.info("Verify user login - Passed");
				Assert.assertTrue(true);
			}
			else
			{
				logger.info("Verify user login - Failed");
				captureScreenshot(driver, "verifyLogin");
				Assert.assertTrue(false);
			}
		}

}
