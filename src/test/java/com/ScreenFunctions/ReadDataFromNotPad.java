//reading data from note pad in text formate
package com.ScreenFunctions;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadDataFromNotPad {
	public static void main(String[] args) throws IOException
	{
		File f = new File("C:\\Users\\tm\\Desktop\\mounica", "abc.txt");
		
		FileReader fr = new FileReader(f);
		
		BufferedReader br = new BufferedReader(fr);
		
		String str = br.readLine();
		//br.readLine(); is used to print the text in next line
		while(!(str==null))
		{
			System.out.println(str);
			str = br.readLine();
		}
	}

}
