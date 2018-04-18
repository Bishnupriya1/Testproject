//Write data to notepad
package com.ScreenFunctions;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.binary.XSSFBSheetHandler;
import org.apache.poi.xssf.eventusermodel.XSSFSheetXMLHandler;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import com.google.common.io.FileWriteMode;

public class WriteDataToNotePad {
	
	@Test
	public void importData() throws IOException
	{
		WebDriver driver;
		driver = new FirefoxDriver();
		driver.get("http://server/bank/");

		List<WebElement> lst = driver.findElements(By.xpath("//*[contains(text(),'BA')]/following-sibling::ul/li"));
		File f= new File("C:\\Users\\tm\\Desktop\\mounica\\abc.txt");
		FileWriter fw = new FileWriter(f);
		PrintWriter pw = new PrintWriter(fw);
		
		int abc = lst.size();
		
		for(int i=0;i<abc;i++)
		{
			String str = lst.get(i).getText();
			//System.out.println(str);
			pw.println(str);
			pw.flush();
		}
        pw.close();
		
	}
}
