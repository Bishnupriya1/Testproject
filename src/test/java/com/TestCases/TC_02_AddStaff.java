package com.TestCases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.GenericFunctions.GenericFunctions;
import com.ScreenFunctions.Admin;
import com.ScreenFunctions.Login_BankApp;

public class TC_02_AddStaff extends GenericFunctions{
	
	 @Test
     public static void tc_Admin_AddStaff()
     {
		 GenericFunctions.launchApplication("firefox");
 		 Login_BankApp lgnbnk=PageFactory.initElements(driver, Login_BankApp.class);
         lgnbnk.login_BankApp();
     
         Admin ad_staff = PageFactory.initElements(driver, Admin.class);
         ad_staff.admin_AddStaff();
   
     }
	

}
