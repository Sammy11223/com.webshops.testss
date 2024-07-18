package com.webshops.testss;

import static org.testng.Assert.assertTrue;

import java.time.Duration;

import javax.swing.plaf.synth.SynthOptionPaneUI;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.webshop.bases.DriverScriptss;
import com.webshop.pagess.HomePages;
import com.webshop.pagess.LoginPages;

public class LoginPageTest extends BaseTestPage {


	@Test(priority = 1)
	public void getLoginpageTitle() {
		homepage.clickLoginLinks();
		String loginpageTitle = loginpage.getLoginPagetitle();
		Assert.assertTrue(loginpageTitle.contains("Login"));
		quitDriver();
	}

	@Test(priority = 2)
	public void loginPageRemembermeCheckBox() {
		homepage.clickLoginLinks();
		boolean flag = loginpage.isRemembermeCheckBoxPresent();

		System.out.println("the remembercheckbox present : " + flag);
		Assert.assertTrue(flag);
		driver.quit();
		;
	}

	@Test(priority = 3)
	public void isWelcometextisPresent() {
		homepage.clickLoginLinks();
		String Actual_welcometext = loginpage.ValidateWelcomeText();

		System.out.println("is wlecometext: " + Actual_welcometext);
		Assert.assertTrue(Actual_welcometext.contains("Welcome"));
	}

	@Test(priority = 4)
	public void testForgotpasswordTextIsdisplayed() {

		homepage.clickLoginLinks();
		boolean flag = loginpage.isFoorgotPassowrdtextPresent();
		System.out.println("is forgotpasswordpresent: " + flag);
		Assert.assertTrue(flag);
		quitDriver();
	}

	@Test(priority = 5)
	public void testLoginFunctions() {

		// launch the browser, coming from the homepage
		//initializationofApplication();
		// now create an object of new homepage// becuase login is in homepage
		//HomePages homepage_1 = new HomePages();

		homepage.clickLoginLinks();
		System.out.println("test1");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//LoginPages loginPage = new LoginPages();

		loginpage.EnterEmailid("sammy123@email.com");
		System.out.println("tesst2");
		loginpage.EnterPasswords("123@Sa1");
		System.out.println("test3");
		loginpage.ClickLoginButtonforsubmission();

		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		/*
		 * try {
		 * 
		 * WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		 * 
		 * wait.until(ExpectedConditions.alertIsPresent()); Alert alert =
		 * driver.switchTo().alert(); System.out.println("the alert text present is: " +
		 * alert.getText());
		 * 
		 * Assert.assertTrue(alert.getText().contains("Please enter "));
		 * alert.sendKeys("Ok");; } catch(Exception e) { System.out.println("*******");
		 * }
		 */
		System.out.println("skibbytesststt");

		boolean flag = homepage.islogoutlinkdisplayed();
		System.out.println("is the logoutlink presnet: " + flag);

		Assert.assertTrue(flag);
		System.out.println("testsuccess2222");
		homepage.ClickLogOutLinks();
		quitDriver();
	}
}
