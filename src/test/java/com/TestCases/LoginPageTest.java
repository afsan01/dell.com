package com.TestCases;

import org.testng.Assert;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.TestBase.TestBase;
import com.TestPages.LoginPage;
import com.TestUtil.TestUtil;

import mx4j.log.Logger;

public class LoginPageTest extends TestBase 
{
	LoginPage loginpage;
	public LoginPageTest() {
	super();
}
	@BeforeMethod
	public void Setup() {
		logger.info("Opening Browser");
		initil();
	    loginpage = new LoginPage();
	    TestUtil.captureScreenShot(driver, "Main Page");
	}
	@Test(priority =2)
	public void VerifyLoginPage() {
		loginpage.VerifyLogin(prop.getProperty("UserName"), prop.getProperty("Password"));
		boolean dashboard = loginpage.VerifyHomePage();
		Assert.assertTrue(dashboard);
		TestUtil.captureScreenShot(driver, "Login Page");
	}
	@Test(priority =0)
	public void VerifyLogoofthePage() {
		logger.info("Verifying Logo of the Page");
		boolean logo = loginpage.verifyLogo();
		Assert.assertTrue(logo);
		//TestUtil.captureScreenShot(driver, "Logo");
	}
	
	@Test(priority =1)
	public void VerifyTitleofThePage() {
		logger.info("Verifying Title of the Page");
		String title = loginpage.VerifiyTitle();
		Assert.assertEquals(title, "Login - TechFios Test Application - Billing");
	}
	
	@Test(priority =3)
	public void VerifyErrorMessage() {
		loginpage.ErrorMessage(prop.getProperty("invalidUser"), prop.getProperty("invalidPassword"));
		boolean er = loginpage.VerifyError();
		Assert.assertTrue(er);
		System.out.println("The Error Message  " + er);
	}
	 @Test(priority=4)
	 public void VerifyHomePage() {
		 loginpage.VerifyLogin(prop.getProperty("UserName"), prop.getProperty("Password"));	
		 boolean dashboard = loginpage.VerifyHomePage();
		 Assert.assertTrue(dashboard);
		 TestUtil.captureScreenShot(driver, "Homepage");
		 
	 }
	@AfterMethod
	public void TearDown() {
		driver.quit();
	}
}
