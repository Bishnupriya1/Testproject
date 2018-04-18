package com.TestCases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.GenericFunctions.GenericFunctions;
import com.ScreenFunctions.Login;
import com.ScreenFunctions.Login_BankApp;

public class TC_01_Login_BankApp extends GenericFunctions 
{
	//execution starts here
      @Test
      public static void tc_login_bank()
      {
    	  GenericFunctions gnfu=new GenericFunctions();
  		
    	  //launching fire fox application
  		  gnfu.launchApplication("firefox");
  		  
  		  
  		  //it is for accessing classes and method to execute 
  		  Login_BankApp lgnbnk=PageFactory.initElements(driver, Login_BankApp.class);
		
  		  lgnbnk.login_BankApp();
      }
}
