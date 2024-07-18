package com.webshop.pagess;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.webshop.bases.DriverScriptss;

public class RegisterPages extends DriverScriptss{
	
	
	//**************** webelement locators***************************
	@FindBy(linkText ="Your Personal Details") private WebElement Personal_DetailsText;
	
	
	
	
	//*********************Constructors********************************
	
	//*************Page Initialziation********************
		//constructor , Pagefactory to help initialize the locators
		
		public RegisterPages(){
			PageFactory.initElements(driver,this);
		}
		
	//*********************Mthods********************************
	
	public String getRegisterPageTitle() {
		return driver.getTitle();
		
	}
	
	public void personalDetailtext() {
		Assert.assertEquals(true, Personal_DetailsText);
	}
	
	//public boolean assertTextPersonal_details() {
		//return Assert.assertTrue(true, "Your Personal Details");
	}


