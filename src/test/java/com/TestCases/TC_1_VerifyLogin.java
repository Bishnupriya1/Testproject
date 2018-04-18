package com.TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.GenericFunctions.GenericFunctions;
import com.ScreenFunctions.Login_BankApp;
import com.ScreenFunctions.VerifyLogin;

public class TC_1_VerifyLogin extends GenericFunctions{
	static WebDriver driver = new FirefoxDriver();

	//execution starts here
    @Test
    public static void tc_login_bank()
    {
  	      GenericFunctions gnfu=new GenericFunctions();
		
  	      //launching fire fox application
		  gnfu.launchApplication("firefox");
		  
		  
		  //it is for accessing classes and method to execute 
		  VerifyLogin lgnbnk=PageFactory.initElements(driver, VerifyLogin.class);
		
		  lgnbnk.verify_Login();
    }
}
