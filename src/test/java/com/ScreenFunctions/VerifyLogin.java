package com.ScreenFunctions;



import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;


import com.GenericFunctions.GenericFunctions;
public class VerifyLogin extends GenericFunctions {

		//User Name	
		@FindBy(how=How.XPATH,using="//input[@name='uname']") 
		WebElement txt_Username;
		
		//Password
		@FindBy(how=How.XPATH,using="//input[@name='pwd']")
		 WebElement txt_Pswrd;

		//Login Button
		@FindBy(how=How.XPATH,using="//input[@name='submitBtn']")
		 WebElement btn_login;
		
		@FindBy(how=How.XPATH,using="//u[text()='Admin']")
		 WebElement lnk_admin;
		
		
		public boolean verify_Login()  {
			 boolean status = true;
			
			 //UserName
			 status=waitForElement(txt_Username);
			 if(status){
				 System.out.println("UserName is found..");
				 
				 String username = getCommontestdata("Username");
				 status = setdata(txt_Username, username);
			 }
			 else {
				 System.out.println("UserName is Not found..");
			 }
			 
			 
			 
			 
			 //Password
			 waitForElement(txt_Pswrd);
			 if(status){
				 System.out.println("Password is found..");
				 String password = getCommontestdata("Password");
				 status = setdata(txt_Pswrd, password);
				 
			 }
			 else {
				 System.out.println("Password is Not found..");
			 }
			 
			//click on login button
			status = hoverAndClick(btn_login);
			
			if(status){
		 		System.out.println("Admin Login Button Clicked...");
				
				WebElement ele= driver.findElement(By.xpath("//a[@href='admin_hompage.php']"));
				String txt=ele.getText();
				if(txt.equals("Admin Home")){
					System.out.println("Login was Successfull..");
				}
				else {
					System.out.println("Login was Not-Successfull");
				}
			}
			else {
				System.out.println("Admin Login Button Not-Clicked...");
			}
			return status;
		}
}
