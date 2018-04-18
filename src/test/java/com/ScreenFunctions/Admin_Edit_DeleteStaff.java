
package com.ScreenFunctions;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.GenericFunctions.GenericFunctions;

public class Admin_Edit_DeleteStaff extends GenericFunctions {
	
	@FindBy(how=How.XPATH,using="//a[text()='Delete staff']")
	WebElement lnk_deletStaff;
	
	@FindBy(how=How.XPATH,using="//input[@name='submit2_id']")
	WebElement btn_click;
	
	
	public boolean deleteStaff()
	{
		boolean status = true;
		
	   status = hoverAndClick(lnk_deletStaff);
	   
	   if(status)
	   {
		    status = true;
		    
		 String str1 = getdata("DeleteStaff", "StaffName", 1);
		 String str2 = getdata("DeleteStaff", "StaffMailid", 1);
		 
		 status = radioDeleteButton("str1", "str2");
		 
		 status = hoverAndClick(btn_click);
	   }
		
		return false;
		
	}
	

}
