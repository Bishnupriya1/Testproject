package com.TestCases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.GenericFunctions.GenericFunctions;
import com.ScreenFunctions.Admin_FieldsUnderChangePassword;

public class TC_003_FieldsUnderChangePswd extends GenericFunctions{
	
	
	@Test
	   public static void tc_VerifyFieldsUnderPswd()	
	   {
		//This will launch Fire fox browser
		GenericFunctions.launchApplication("firefox");
		
		//We get business logic here as we used page factory
		Admin_FieldsUnderChangePassword verifyFields = PageFactory.initElements(driver, Admin_FieldsUnderChangePassword.class);
		verifyFields.admin_FieldsUnderChangePswd();
	   }

}
