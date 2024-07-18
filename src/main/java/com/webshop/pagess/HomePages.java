package com.webshop.pagess;



import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.webshop.bases.DriverScriptss;

public class HomePages extends DriverScriptss{
	
	//****************************************PageLocators**************************************************
	
		@FindBy(linkText = "Log in") private WebElement LoginLinks;
		@FindBy(linkText = "Log out") private WebElement LogoutLinks;
		@FindBy(xpath= "//a[@class='ico-register']") private WebElement RegisterLinks;
		// writing the webelement as Private becuase 
		//of this loginlink is belonging to homepage only//then we need to create the constructor for login becaue it in is the homepage
	
	
		
	//*********************************************Page initialization********************************************
	//constructor	is used to initialzie the eelement
		//create a constructor for login
		
		public HomePages() {
			//driver element is coming from DriverScripts, this element is coming from the line 15 for the loginLinks
			PageFactory.initElements(driver, this);
			
	
		}
//**********************************Page Methods/aCTION****************************************************************
		
		
		public void ClickRegisterLink() {
			RegisterLinks.click();
}
		
		public boolean islogoutlinkdisplayed() {
			return LogoutLinks.isDisplayed();
		}
		
		public void ClickLogOutLinks() {
			LogoutLinks.click();
			
		}
		
		public void clickLoginLinks() {
			LoginLinks.click(); //clicking action on login link
		}
		
		
		public String getHomepageTitle() {
			return driver.getTitle();
		}
	}


