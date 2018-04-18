package com.TestCases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.GenericFunctions.GenericFunctions;
import com.ScreenFunctions.Admin_Edit_DeleteStaff;
import com.ScreenFunctions.Login_BankApp;

public class TC_004_Edit_DeleteStaff extends GenericFunctions {

	@Test
	   public static void edit_DeleteStaff_RadioBtn()	
	   {
		//This will launch Fire fox browser
		GenericFunctions.launchApplication("firefox");
		
		//it is for accessing classes and method to execute 
		  Login_BankApp lgnbnk1=PageFactory.initElements(driver, Login_BankApp.class);
		
		  lgnbnk1.login_BankApp();
		  
		  Admin_Edit_DeleteStaff delStaff = PageFactory.initElements(driver, Admin_Edit_DeleteStaff.class);
		  
		  delStaff.deleteStaff();
	   }
}
