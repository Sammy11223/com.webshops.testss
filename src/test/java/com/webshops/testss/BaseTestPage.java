package com.webshops.testss;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.webshop.bases.DriverScriptss;
import com.webshop.pagess.HomePages;
import com.webshop.pagess.LoginPages;
import com.webshop.pagess.RegisterPages;

public class BaseTestPage extends DriverScriptss {

	HomePages homepage;
	LoginPages loginpage;
	RegisterPages registeringpage;

	@BeforeMethod
	public void setUp() {
		initializationofApplication();
		homepage = new HomePages();
		loginpage = new LoginPages();
		registeringpage = new RegisterPages();
	}

	@AfterMethod
	public void tearDown() {
		quitDriver();
	}

}
