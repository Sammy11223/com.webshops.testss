package com.webshop.bases;


import java.io.File;
import java.io.FileInputStream;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class DriverScriptss {
	public static WebDriver driver = new ChromeDriver(); // this is public because we need to call the webdriver driver element from another classes which will extends the DriverScripts class
	static Properties prop;
	
	
//the constructor will initialize the values to be used from the class
	//it will be used to read the contents from the Properties file
	public  DriverScriptss() {
		
		try {
			File file = new File("./src/test/resources/configss/config.properties");
			FileInputStream files =new FileInputStream(file);
			prop = new Properties();
			prop.load(files);
		
		}
		catch(Exception e)
		{
			e.printStackTrace();
			System.out.println("unable to laod the properties file! ");
		}
	}
	
	/*
	 * this method is used to initialzie the driver based on the values frm properties files
	 * we need to put @test here, when we will run the Test, then once done running, we need to remove it
	 */
  // @Test
	
	public void initializationofApplication() {
		String browsers = prop.getProperty("browser");
		
		
		if (browsers.trim().equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();	
		}
		else if (browsers.trim().equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
		}	
			else if(browsers.trim().equalsIgnoreCase("edge")) {
				driver = new EdgeDriver();
			}
		
			else {
				System.out.println("Unsupported Browser, Please check the config files");
			}
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		//Explicitly wait for certain time for driver to wait becuase the page load migth take too much time
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		getApplicationUrls();
	
		
		
		System.out.println("success1");
		//
		//now we will get the Url using the .getProperty() method
	}
	
	/*
	 *  this method is used to navigate to the url
	 */
	public static void getApplicationUrls() {	
		String demoshopurl = prop.getProperty("url");
		System.out.println("succes2");
		driver.get(demoshopurl);
		System.out.println("success3");
		}
	
	/*
	 * this method is used to quit the Url
	 */
	
		public static void quitDriver() {
			driver.quit();		}

}
		
	
