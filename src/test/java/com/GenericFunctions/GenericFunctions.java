package com.GenericFunctions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.codoid.products.exception.FilloException;
import com.codoid.products.fillo.Recordset;

public class GenericFunctions extends TestNGListeners {
	
	
	public static  WebDriver driver;

	
	

	/*************************************************
	
	
	Function Name:launchApplication
	
	Purpose:-This Function is used to launch the HRM Application when ever the user is required
	
	Input Parameters:-User must send in which browser does the application need to be launch
	
	Output Parameters:-This method will return a boolean value stating wheter the user logged into in the system
	
	Author:-Veera Prathap Malepati
	
	Creationn date:-12/30/2017
	
	
	**************************************************/
	
	
	
	
	
	public static boolean launchApplication(String browser) {
		
		boolean status=true;
		
		
		switch (browser.toLowerCase()) {
		case "ie":
			
			break;

		case "firefox":
			
			driver= new FirefoxDriver();
			
			String url=getCommontestdata("Url");
			
		//	System.out.println(url);
			
			driver.get(url);
			
			driver.manage().window().maximize();
			
			//driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
			
			
			break;
			
		case "chrome":
			
			break;
			
			
			
		default:
			break;
		}
		
	return status;	
		
	}
	

	/*************************************************
	
	
	Function Name:GetCommonTestdata 
	
	Purpose:-This Function is used to get the common test data which can be accessed commonly for each testcase such as Environment,Url,Username,Password
	
	Input Parameters:-User must send an argument stating what data that is required
	
	Output Parameters:-This method will return a string value for the User given input(If data is not found it will return a null)
	
	Author:-Veera Prathap Malepati
	
	Creationn date:-12/31/2017
	
	
	**************************************************/
	
	
	
	
	public static String getCommontestdata(String data)
	{
		
		String strQuery="Select "+ data+" from CommonTestdata";
		
		System.out.println(strQuery);
		
		Recordset recordset;
		
		String fetcheddata="";
		
		
		try {
			
			recordset = TestNGListeners.connection.executeQuery(strQuery);
			
			while(recordset.next()){
				
				System.out.println("Data is found and the data is " +recordset.getField(data));
				
				fetcheddata=recordset.getField(data);
				break;
				
				
				}
				 
				recordset.close();
			
			
		} catch (FilloException e) {
			
			System.out.println("No Records Found");
		}
		 
		return fetcheddata;
		
		
	}
	
	
/*************************************************
	
	
	Function Name:getdata
	
	Purpose:-This Function is used to get the common test data which can be accessed commonly for each testcase such as Environment,Url,Username,Password
	
	Input Parameters:-User must send an argument stating what data that is required
	
	Output Parameters:-This method will return a string value for the User given input(If data is not found it will return a null)
	
	Author:-Veera Prathap Malepati
	
	Creationn date:-12/31/2017
	
	
	**************************************************/
	
	public static String getdata(String sheetname,String userdata,int itr)
	{
		
		String strQuery="Select "+ userdata+" from "+sheetname+ " where Tc_Name='"+crntclass+"' and Iteration="+itr;
		System.out.println(strQuery);
		
		Recordset recordset;
		
		String fetcheddata="";
		
		
		try {
			
			recordset = TestNGListeners.connection.executeQuery(strQuery);
			
			while(recordset.next()){
				
				System.out.println("Data is found and the data is " +recordset.getField(userdata));
				
				fetcheddata=recordset.getField(userdata);
				break;
				
				
				}
				 
				recordset.close();
			
			
		} catch (FilloException e) {
			
			System.out.println("No Records Found");
		}
		 
		return fetcheddata;
		
		
	}
	
	
	
/*************************************************
	
	
	Function Name:Setdata
	
	Purpose:-This Function is used to set the common test data which can be accessed commonly for each testcase 
	
	Input Parameters:-User must send an argument stating what data that is required
	
	Output Parameters:-This method will return a string value for the User given input(If data is not found it will return a null)
	
	Author:-Veera Prathap Malepati
	
	Creationn date:-12/31/2017
 * @return 
	
	
	**************************************************/
	
	public static boolean setdata(WebElement element, String data )
	{
		 boolean status = true;
		 status = waitForElement(element);
		 
		 if(status)  {
			 try  {
				  //element.click();
				  //element.clear();
				  element.sendKeys(data);
			   }
			 catch(Exception e)
			   {
				 status=false; 
			   }
	     }
		 return status;
	}
	
	
/*************************************************
	
	
	Function Name:Waitforelement
	
	Purpose:-This Function is used to get the common test data which can be accessed commonly for each testcase such as Environment,Url,Username,Password
	
	Input Parameters:-User must send an argument stating what data that is required
	
	Output Parameters:-This method will return a string value for the User given input(If data is not found it will return a null)
	
	Author:-Veera Prathap Malepati
	
	Creationn date:-12/31/2017
	
	
	**************************************************/
	
	
	
	
	public static boolean waitForElement(WebElement element)
	{
		 boolean status = true;
		for(int i=1;i<=10;i++)
		{
		try
		{
			System.out.println("Wait is executing");
			Actions acc=new Actions(driver);
			acc.moveToElement(element).build().perform();
			
			System.out.println("Element Found");
			break;
			
		}
		catch(Exception e)
		{
			try {
				Thread.sleep(1000);
				
			} catch (InterruptedException e1) {
				
				e1.printStackTrace();
			}
			
		}
		}	
		return status;
	}
	
/*************************************************
	
	
	Function Name:Hoverandclick 
	
	Purpose:-This Function is used to get the common test data which can be accessed commonly for each testcase such as Environment,Url,Username,Password
	
	Input Parameters:-User must send an argument stating what data that is required
	
	Output Parameters:-This method will return a string value for the User given input(If data is not found it will return a null)
	
	Author:-Veera Prathap Malepati
	
	Creationn date:-12/31/2017
	
	
	**************************************************/
	
	public static boolean hoverAndClick(WebElement element)
	{
	boolean status=true;
		
		try
		{
			waitForElement(element);
			Actions acc=new Actions(driver);
			acc.moveToElement(element).click().build().perform();
		
		}
		catch(Exception e)
		{
			
			status=false;
		
		}	
		
	
	
	return status;
	}	
	
	public static void forceClick(WebElement element)
	{
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		js.executeScript("arguments[0].click();", element);
		
	}

/*************************************************
	
	
	Function Name:Selectoption 
	
	Purpose:-This Function is used to get the data from drop down
	
	Input Parameters:-User must send an argument stating what data that is required
	
	Output Parameters:-This method will return a string value for the User given input(If data is not found it will return a null)
	
	Author:-Veera Prathap Malepati
	
	Creationn date:-12/31/2017
	
	
	**************************************************/
	
	public static boolean selectOption(WebElement lstelement,String optiondata)
	
	{		
		boolean status=true;
		
		//status=hoverAndClick(driver.findElement(By.xpath("//option[text()='"+optiondata.trim()+"']")));
		try{
		Select slct=new Select(lstelement);
		
		slct.selectByVisibleText(optiondata);
		System.out.println("option "+optiondata+" is selected sucessfully For the element "+lstelement);
		}
		catch(Exception e)
		{
			status=false;
			System.out.println("Unable to select the option "+optiondata+" For the element "+lstelement);
		}
		
		return status;
		
	}
	
/*************************************************
	
	
	Function Name:RadioDeleteButton 
	
	Purpose:-This Function is used to get the data(gmail) regarding selected option
	
	Input Parameters:-User must send an argument stating what data that is required
	
	Output Parameters:-This method will return a string value for the User given input(If data is not found it will return a null)
	
	Author:-Veera Prathap Malepati
	
	Creationn date:-12/31/2017
	
	
	**************************************************/
	
	public static boolean radioDeleteButton(String colname, String email)
	{
		boolean status = true;
		
		WebElement ele = driver.findElement(By.xpath("//td[text()='"+colname+"']/following-sibling::td[8]/preceding-sibling::td[9]"));
		status = hoverAndClick(ele);
		
		if(status)
		{
			System.out.println("Selected Radio button clicked");
		}
		else
		{
			
			System.out.println("There is no radio button selected");
		}
		return status;
	}
	

	//*********************************************************************
		/**
		 * Method Name: verify_ElementDisplay
		 * Purpose: To verify Element is to displayed
		 * Input Parameters: Browser
		 * Output Parameters: Boolean
		 * Designed by:
		 * Reviewed by:
		 * Comments:
		 * Modify Date:
		 * Modified Reason
		 */
	//********************************************************************
	public static boolean verify_ElementDisplay(WebElement element)
	{
		boolean status=true;
		
		
		try
		{
		waitForElement(element);
		if(element.isDisplayed())
		{
			System.out.println("Element is displayed");
		}
		
		}
		catch(Exception e)
		{
			status=false;
			System.out.println("Element is not displayed");
		}
		return status;
	}
	
	
}
