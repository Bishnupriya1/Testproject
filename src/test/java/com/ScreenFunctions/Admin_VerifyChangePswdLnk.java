package com.ScreenFunctions;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.GenericFunctions.GenericFunctions;

public class Admin_VerifyChangePswdLnk extends GenericFunctions {
	
	//Login in bank application
	
	//Locating WebElement User name
	@FindBy(how=How.XPATH,using="//input[@name='uname']")
	WebElement txt_Username;
	
	//Locating WebElement Password
    @FindBy(how=How.XPATH,using="//input[@name='pwd']")
	public static WebElement txt_Pswrd;

	//Locating WebElement Login Button
	@FindBy(how=How.XPATH,using="//input[@name='submitBtn']")
	public static WebElement btn_login;
	
	//Locating WebElement Change Password
	@FindBy(how=How.XPATH,using="//a[text()='Change password']")
	public static WebElement lnk_change_Pswd;

	
/*************************************************
	
	
	Function Name: admin_VerifyLnkChngPswd
	
	Purpose:-This Function is used to login into the bank Application when ever the user is required
	         and checking change password is enabled or not
	
	Input Parameters:-NA
	
	Output Parameters:-This method will return a boolean value stating whether the application is launched or not
	
	Author:-mounica
	
	Creationn date:-6/4/2018
	
	
	**************************************************/	
	
	public boolean admin_VerifyLnkChngPswd()
	{
		boolean status = true;
		
		// This field is for entering user name
		String username = getCommontestdata("Username");
		status = setdata(txt_Username, username);
		if(status)
		{
			System.out.println("Username is entered Sucessfully");
			logEvent("pass", "Username is entered Sucessfully");
		}else
		{
			System.out.println("Username is not entered Sucessfully");
			logEvent("fail", "Username is not entered Sucessfully");
		}
		
		// This field is for entering password
		String Password = getCommontestdata("Password");
		status = setdata(txt_Pswrd, Password);
		if(status)
		{
			System.out.println("Password is entered Sucessfully");
			logEvent("pass", "Password is entered Sucessfully");
		}else
		{
			System.out.println("Password is not entered Sucessfully");
			logEvent("fail", "Password is not entered Sucessfully");
		}
		
		// This field is for clicking on the button
		status = hoverAndClick(btn_login);
		if(status)
		{
			System.out.println("Login button clicked Sucessfully");
			logEvent("pass", "Login button clicked Sucessfully");
		}else
		{
			System.out.println("Login button not clicked Sucessfully");
			logEvent("fail", "Login button not clicked Sucessfully");
		}
		
		//This field is for checking whether the change password is enabled or not
		status = hoverAndClick(lnk_change_Pswd);
		if(status)
		{
			System.out.println("Link change password cilcked Sucessfully");
			logEvent("pass", "Link change password cilcked Sucessfully");
		}else
		{
			System.out.println("Link change password not cilcked Sucessfully");
			logEvent("fail", "Link change password not cilcked Sucessfully");
		}
		
		//it will return status, if status is not true 
		return status;
		
		
		
	}
}
