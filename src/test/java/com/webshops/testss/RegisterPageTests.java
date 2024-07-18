package com.webshops.testss;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.webshop.pagess.HomePages;
import com.webshop.pagess.RegisterPages;

public class RegisterPageTests  extends BaseTestPage{
	

@Test
public void testRegisterLinkTitlePage() {
	
	
	homepage.ClickRegisterLink();
	
	RegisterPages Registeringpage = new RegisterPages();
	String registitle = Registeringpage.getRegisterPageTitle();
	System.out.println("registeing page title is: "+ registitle);	
	
}

}
