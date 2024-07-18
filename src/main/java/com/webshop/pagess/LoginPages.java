package com.webshop.pagess;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.webshop.bases.DriverScriptss;

public class LoginPages extends DriverScriptss{
	
	//***page locators***
	//***initalize******************
	//***********page Methods*************
	
	@FindBy(id ="Email") private WebElement emailIdtextbox;
	@FindBy(id ="Password") private WebElement passowrdTextBox;
	
	@FindBy(xpath="//input[@class='button-1 login-button']") private WebElement LoginButton;
	@FindBy(xpath="//h1[text()='Welcome, Please Sign In!']") private WebElement WelcomeSinginText;
	@FindBy(linkText ="Forgot password?") private WebElement forgotpassowrdText;
	@FindBy(xpath = "//label[@for ='RememberMe']") private WebElement RemembermeCheckBox;
	
//*************Page Initialziation********************
	//constructor , Pagefactory to help initialize the locators
	
	public LoginPages(){
		PageFactory.initElements(driver,this);
	}
	
	
	//********************Page Methods Action***************************
	public String welcometext() {
	return WelcomeSinginText.getText();
	}
	public boolean isFoorgotPassowrdtextPresent() {
		return forgotpassowrdText.isDisplayed();
	}
		
	public boolean isRemembermeCheckBoxPresent() {
		return RemembermeCheckBox.isDisplayed();
	}
	
	public String ValidateWelcomeText() {
		return  WelcomeSinginText.getText();
	}
	
	public void EnterEmailid(String emailId) {
		emailIdtextbox.sendKeys("sammy123@email.com");//sammy123@mail.com
	}
	
	public void EnterPasswords(String passowrd) {
		passowrdTextBox.sendKeys("123@Sa1"); //Sammy Tim
	}
	
	public void ClickLoginButtonforsubmission() {
		LoginButton.click();				
	}
	
	//making sureto get the title
	public String getLoginPagetitle() {
		return driver.getTitle();	
	}
}