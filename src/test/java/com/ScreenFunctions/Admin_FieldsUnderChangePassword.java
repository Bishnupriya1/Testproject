package com.ScreenFunctions;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.GenericFunctions.GenericFunctions;

public class Admin_FieldsUnderChangePassword extends GenericFunctions {
	
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
		
		//Locating WebElement for old password
		@FindBy(how=How.XPATH,using="//*[@name='old_password']")
		public static WebElement txt_oldpswd;
				
		//Locating WebElement for new password
		@FindBy(how=How.XPATH,using="//input[@name='new_password']")
		public static WebElement txt_newpswd;
				
		//Locating WebElement enter password again
		@FindBy(how=How.XPATH,using="//input[@name='again_password']")
		public static WebElement txt_pswd_again;
				
		//Locating WebElement for clicking on button
		@FindBy(how=How.XPATH,using="//input[@name='change_password']")
		public static WebElement btn_click;

		
		/*************************************************
			
			
			Function Name: admin_FieldsUnderChangePswd
			
			Purpose:-This Function is used to login into the bank Application when ever the user is required
			         and check whether the fields are displayed or not
			
			Input Parameters:-NA
			
			Output Parameters:-This method will return a boolean value stating whether the application is launched or not
			
			Author:-mounica
			
			Creationn date:-6/4/2018
			
			
			**************************************************/	
		
		public boolean admin_FieldsUnderChangePswd()
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
				System.out.println("Button login was clicked Sucessfully");
				logEvent("pass", "Button login was clicked Sucessfully");
			}else
			{
				System.out.println("Button login was not clicked Sucessfully");
				logEvent("fail", "Button login was not clicked Sucessfully");
			}
			
			//This field is for clicking on change password link
			status = hoverAndClick(lnk_change_Pswd);
			if(status)
			{
				System.out.println("Button login was clicked Sucessfully");
				logEvent("pass", "Button login was clicked Sucessfully");
			}else
			{
				System.out.println("Button login was not clicked Sucessfully");
				logEvent("fail", "Button login was not clicked Sucessfully");
			}
			
		
			// This field is for entering OldPassword
			String old_pswd = getdata("VerifyFeilds","OldPassword",1);
			status = setdata(txt_oldpswd, old_pswd);
			if(status)
			{
				System.out.println("OldPassword is entered Sucessfully");
				logEvent("pass", "OldPassword is entered Sucessfully");
			}else
			{
				System.out.println("OldPassword is not entered Sucessfully");
				logEvent("fail", "OldPassword is not entered Sucessfully");
			}

			// This field is for entering user name
			String new_pswd	= getdata("VerifyFeilds","NewPassword",1);
			status = setdata(txt_newpswd, new_pswd);
			if(status)
			{
				System.out.println("NewPassword is entered Sucessfully");
				logEvent("pass", "NewPassword is entered Sucessfully");
			}else
			{
				System.out.println("NewPassword is not entered Sucessfully");
				logEvent("fail", "NewPassword is not entered Sucessfully");
			}
			
			// This field is for entering user name
			String reenter= getdata("VerifyFeilds","ReEnterPassword",1);
			status = setdata(txt_pswd_again, reenter);
			if(status)
			{
				System.out.println("PasswordAgain is entered Sucessfully");
				logEvent("pass", "PasswordAgain is entered Sucessfully");
			}else
			{
				System.out.println("PasswordAgain is not entered Sucessfully");
				logEvent("fail", "PasswordAgain is not entered Sucessfully");
			}
			
			// This field is for entering user name
			status = hoverAndClick(btn_click);
			if(status)
			{
				System.out.println("Button clicked Sucessfully");
				logEvent("pass", "Button clicked Sucessfully");
			}else
			{
				System.out.println("Button clicked not Sucessfully");
				logEvent("fail", "Button clicked not Sucessfully");
			}
			
			
			//it will return status, if status is not true 
			return status;
			
			
		}
}
