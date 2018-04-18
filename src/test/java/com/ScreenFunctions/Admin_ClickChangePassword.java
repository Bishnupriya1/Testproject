
package com.ScreenFunctions;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.GenericFunctions.GenericFunctions;

public class Admin_ClickChangePassword extends GenericFunctions {
	
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
	
	
	Function Name: admin_ClickOnChngPswd
	
	Purpose:-This Function is used to login into the bank Application when ever the user is required
	         and clicking on enabled change password link
	
	Input Parameters:-NA
	
	Output Parameters:-This method will return a boolean value stating whether the application is launched or not
	
	Author:-mounica
	
	Creationn date:-6/4/2018
	
	
	**************************************************/	
	
	public boolean admin_ClickOnChngPswd()
	{
		boolean status = true;
		
		// This field is for entering user name
		String username = getCommontestdata("Username");  // selecting data from table
		status = setdata(txt_Username, username);  //click,clear,send data
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
			System.out.println("LoginButton  is clicked Sucessfully");
			logEvent("pass", "LoginButton  is clicked Sucessfully");
		}else
		{
			System.out.println("LoginButton  is not clicked Sucessfully");
			logEvent("fail", "LoginButton  is not  clicked Sucessfully");
		}
		
		//This field is for clicking on change password link
		status = hoverAndClick(lnk_change_Pswd);
		
		if(status)
		{
			System.out.println("Change Password Link is clicked Sucessfully");
			logEvent("pass", "Change Password Link is clicked Sucessfully");
		}else
		{
			System.out.println("Change Password Link is not clicked Sucessfully");
			logEvent("fail", "Change Password Link is not clicked Sucessfully");
		}
		
		
		//it will return false, if status is not true 
		return false;
		
	}
}
