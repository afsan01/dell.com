package com.TestPages;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.TestBase.TestBase;

public class ProductNServicesPage extends TestBase {
	 @FindBy(id="name")
	  WebElement TypeName;
	  @FindBy(id="sales_price")
	  WebElement SalesPrice;
	  @FindBy (id="item_number")
	  WebElement ItemNumber;
	  @FindBy (id="description")
	  WebElement Description;
	  @FindBy (xpath = "//*[@id=\"side-menu\"]/li[6]/a/span[1]")
	  WebElement ProductNServices;
	  @FindBy (xpath = "//*[@id=\"side-menu\"]/li[6]/ul/li[4]/a")
	  WebElement NewService;
	  @FindBy (xpath = "//*[@class=\"alert alert-success fade in\"]")
	  WebElement SuccessMessage;
	  @FindBy (id = "submit")
	  WebElement Submit;
	  
	 
	  
	  public ProductNServicesPage() {
		  PageFactory.initElements(driver, this);
	  }
	  
	  
	  public void ProductNService()  {
		  ProductNServices.click();
	  }
		  
	  public void NewService() {
		  
		  NewService.click();
		  
	  }
	 public boolean ValidateSuccessMessage() {
		 return SuccessMessage.isDisplayed();
	 }
	  
	  public void NewOrder(String name, String salesPrice, String description, String itemNumber){
		 
		 TypeName.sendKeys(name);
		 SalesPrice.sendKeys(salesPrice);
		 ItemNumber.sendKeys(itemNumber);
		 Description.sendKeys(description);
		 
		 Submit.click();
	  }
		  
		  
	
	  
	  
			  
	  

}
