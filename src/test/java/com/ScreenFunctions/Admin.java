package com.ScreenFunctions;

import javax.mail.search.SentDateTerm;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.GenericFunctions.GenericFunctions;

public class Admin extends GenericFunctions {
	
	@FindBy(how=How.XPATH,using="//*[text()='Add staff member']")
	public static WebElement lnk_admin_addstaff;
	
	@FindBy(how=How.XPATH,using="//input[@name='staff_name']")
	public static WebElement txt_staffname;
	
	@FindBy(how=How.XPATH,using="//*[@name='staff_gender'][2]")
	public static WebElement rdo_staffGender;
	
	@FindBy(how=How.XPATH,using="//input[@name='staff_dob']")
	public static WebElement txt_StaffDOB;
	
	@FindBy(how=How.XPATH,using="//*[@name='staff_status']")
	public static WebElement lst_StaffRelation;
	
	@FindBy(how=How.XPATH,using="//*[@name='staff_dept']")
	public static WebElement lst_StaffDepartment;
	
	@FindBy(how=How.XPATH,using="//input[@name='staff_doj']")
	public static WebElement txt_StaffDOJ;
	
	@FindBy(how=How.XPATH,using="//*[@name='staff_address']")
	public static WebElement txt_StaffAddress;
	
	@FindBy(how=How.XPATH,using="//*[@name='staff_mobile']")
	public static WebElement txt_Staffmob;
	
	@FindBy(how=How.XPATH,using="//*[@name='staff_email']")
	public static WebElement txt_StaffEmail;
	
	@FindBy(how=How.XPATH,using="//*[@name='staff_pwd']")
	public static WebElement txt_Staffpassword;
	
	@FindBy(how=How.XPATH,using="//*[@name='add_staff']")
	public static WebElement btn_AddStaff;
	
	
	
/*************************************************
	
	
	Function Name: admin_AddStaff
	
	Purpose:-This Function is used to click on Add staff member and entering all the fields in that page
	
	Input Parameters:-NA
	
	Output Parameters:-This method will return a boolean value stating whether the application is launched or not
	
	Author:- mounica
	
	Creation date:-6/4/2018
	
	
	**************************************************/	
	
	
	public  boolean admin_AddStaff()
	{
		//It will return boolean value
		boolean status = true;
		
		//Click on admin add staff link
		status=hoverAndClick(lnk_admin_addstaff);

		//Enter data in user name
		String username = getdata("TestData", "StaffName", 1);
		status = setdata(txt_staffname, username);
		
		//click on selected radio button
		status = hoverAndClick(rdo_staffGender);
		
		//Enter DOB
		String DOB = getdata("TestData","DOB",1);
		status = setdata(txt_StaffDOB, DOB);
		
		//Get the data for the field relationship from the excel and pass to method selectoption
		String rel = getdata("TestData","Relationship",1);
		status = selectOption(lst_StaffRelation,rel);
		
		
		//Get the data for the field Department from the excel and pass to method selectoption
		String dept = getdata("TestData","Department",1);
		status = selectOption(lst_StaffDepartment,dept);
		
		//Enter the date of joining 
		String DOJ = getdata("TestData","DOJ",1);
		status = setdata(txt_StaffDOJ, DOJ);
		
		//Enter staff Address
		String Address = getdata("TestData","Address",1);
		status = setdata(txt_StaffAddress, Address);
		
		//Enter the mobile number
		String Mobile = getdata("TestData","Mobile",1);
		status = setdata(txt_Staffmob, Mobile);
		
		//Enter email of staff
		String E_mail = getdata("TestData","Email",1);
		status = setdata(txt_StaffEmail, E_mail);
		
		//Enter staff password
		String Password = getdata("TestData","Password",1);
		status = setdata(txt_Staffpassword, Password);
		
		//Click on AddStaff button
		status = hoverAndClick(btn_AddStaff);
		
		//It will return status
		return status;
	}	
	

}
