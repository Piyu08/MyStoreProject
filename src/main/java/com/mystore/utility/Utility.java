package com.mystore.utility;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.*;
import java.util.*;
import java.util.Properties;
import org.apache.poi.xssf.util.*;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

import com.mystore.Base.TestBase;

public class Utility extends TestBase{

	/*public static String FetchData(String key) throws IOException {
	
	FileInputStream file = new FileInputStream("C:\\Users\\dhrum\\eclipse-workspace\\MyStoreProject\\Configuration\\config.properties");
	Properties property = new Properties();
	property.load(file);
	return property.get(key).toString();
	}
	*/
	@DataProvider(name="ExcelTestData") 
	public static Object[][] fetchexceldata()throws Exception
	{
		FileInputStream file = new FileInputStream("C:\\Users\\dhrum\\eclipse-workspace\\MyStoreProject\\TestData\\Testdata.xlsx");
		XSSFWorkbook workbook =new XSSFWorkbook(file);
		XSSFSheet loginsheet = workbook.getSheet("Login");
		int noOfData = loginsheet.getPhysicalNumberOfRows();
		Object [][] testData = new Object[noOfData][2];
		
		for (int i=0;i<noOfData;i++)
		{
			XSSFRow row = loginsheet.getRow(i);
			XSSFCell username=row.getCell(0);
			XSSFCell password=row.getCell(1);
			testData[i][0]=username.getStringCellValue();
			testData[i][1]=password.getStringCellValue();			
		}
		
		return testData;
		}

	
	
	
}
