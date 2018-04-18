package com.ScreenFunctions;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.GenericFunctions.GenericFunctions;

public class Login_BankApp extends GenericFunctions
{
	
	// ****************************  Login Panel Section Object  *********************************
	
	//User Name	
	@FindBy(how=How.XPATH,using="//input[@name='uname']")
	public static WebElement txt_Username;
	
	//Password
	@FindBy(how=How.XPATH,using="//input[@name='pwd']")
	public static WebElement txt_Pswrd;

	//Login Button
	@FindBy(how=How.XPATH,using="//input[@name='submitBtn']")
	public static WebElement btn_login;

	
	
/*************************************************
	
	
	Function Name: Login_BankApp
	
	Purpose:-This Function is used to login into the bank Application when ever the user is required
	
	Input Parameters:-NA
	
	Output Parameters:-This method will return a boolean value stating whether the application is launched or not
	
	Author:-mounica
	
	Creationn date:-5/4/2018
	
	
	**************************************************/	
   
	public  boolean login_BankApp()
	{
		boolean status = true;
		
		
		    //Based on the Username status Enter password
			String username = getCommontestdata("Username");
			status = setdata(txt_Username, username);
	
			//Based on the Password status Enter password
			String password = getCommontestdata("Password");
			status = setdata(txt_Pswrd, password);
		  			
			//click on login button
			status = hoverAndClick(btn_login);
			
			//it will return status				
		   return status;
	}
}
