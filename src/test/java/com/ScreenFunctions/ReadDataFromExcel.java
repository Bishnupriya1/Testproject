package com.ScreenFunctions;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ReadDataFromExcel {

	public static void main(String[] args) throws IOException 
	{
		WebDriver driver = new FirefoxDriver();
		
		List<WebElement> lst = driver.findElements(By.xpath(""));
		
        File f = new File("C:\\Users\\tm\\Desktop\\Importing DataToExcel Sheet.xlsx");
        FileInputStream fis = new FileInputStream(f);
        XSSFWorkbook wb = new XSSFWorkbook(fis);
        System.out.println("Work Book" +wb);
        
        XSSFSheet s = wb.getSheet("Importing Data");
        System.out.println("Sheet" +s); 
        
        int n = lst.size();
        FileOutputStream fos = new FileOutputStream(f);
        
        
	}

}
