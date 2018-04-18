package com.TestCases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.GenericFunctions.GenericFunctions;
import com.ScreenFunctions.Admin_ClickChangePassword;

public class TC_002_ClickChangePassword extends GenericFunctions {
	
	@Test
   public static void tc_ClickChange_Password()	
   {
		//This will launch Fire fox browser
	   GenericFunctions.launchApplication("firefox");
	   
	    //We get business logic here as we used page factory
	   Admin_ClickChangePassword clk_passwword = PageFactory.initElements(driver, Admin_ClickChangePassword.class);
	   clk_passwword.admin_ClickOnChngPswd();
   }

}
