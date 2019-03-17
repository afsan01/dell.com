package com.TestPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.TestBase.TestBase;


public class LoginPage extends TestBase
{
	 @FindBy(name="username")
	  WebElement Username;
	  @FindBy(name="password")
	  WebElement Password;
	  @FindBy (name="login")
	  WebElement SignInButton;
	  @FindBy(xpath="/html/body/div/div/div/div/img")
	  WebElement Logo;
	  @FindBy (xpath="//div[@class=\"alert alert-danger fade in\"]")
	  WebElement ErrorMessage;
	  @FindBy (xpath="//*[@id=\"page-wrapper\"]/div[2]/div/h2")
	  WebElement Dashboard;
	  public LoginPage() {
		  PageFactory.initElements(driver, this);
	  }
	  public void VerifyLogin(String Un, String pw) {
		  Username.sendKeys(Un); 
		  Password.sendKeys(pw);
		  SignInButton.click();
	  }
	  public boolean VerifyHomePage() {
		  return Dashboard.isDisplayed();
	  }
	  
	  public String VerifiyTitle() {
		  return driver.getTitle();
		 
	  }
	  public boolean verifyLogo() {
		  return Logo.isDisplayed();
	  }
	  
	  public void ErrorMessage(String Un, String pw) {
		  Username.sendKeys(Un);
		  Password.sendKeys(pw);
		  SignInButton.click();
	  }
	  public boolean VerifyError() {
		  return ErrorMessage.isDisplayed();
	  }
	  
}
