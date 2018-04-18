package com.TestCases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.GenericFunctions.GenericFunctions;
import com.ScreenFunctions.Admin_VerifyChangePswdLnk;

public class TC_001_VerifyChngPswdLnk extends GenericFunctions {
	
	
	@Test
	public static void tc_VerifyChangePswdLnk()
	{
		//This will launch Fire fox browser
		GenericFunctions.launchApplication("firefox");
		
		//We get business logic here as we used Page factory
		Admin_VerifyChangePswdLnk verifylnk = PageFactory.initElements(driver, Admin_VerifyChangePswdLnk.class);
		verifylnk.admin_VerifyLnkChngPswd();
	}	

}
