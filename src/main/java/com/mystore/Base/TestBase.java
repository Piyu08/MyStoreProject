package com.mystore.Base;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;

import com.beust.jcommander.Parameter;


import io.github.bonigarcia.wdm.WebDriverManager;


public class TestBase {
	public static WebDriver driver;
	
	public static Object FetchData(String key) throws IOException {
		
		FileInputStream file = new FileInputStream("C:\\Users\\dhrum\\eclipse-workspace\\MyStoreProject\\Configuration\\config.properties");
		Properties property = new Properties();
		property.load(file);
		return property.get(key);
	}	


@BeforeMethod
public void IntializeWebdriver(String browser) throws IOException {
//create driver instance of multiple browser and use utility method to fetch the data from properties file
	 if (TestBase.FetchData(browser).toString().equalsIgnoreCase("Chrome"))
	 {
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\dhrum\\eclipse-workspace\\testNg\\src\\main\\resources\\driversfolder\\chromedriver.exe");
		 driver = new ChromeDriver();
     } else if (TestBase.FetchData(browser).toString().equalsIgnoreCase("Chrome")) 
     {
        driver = new FirefoxDriver();
     } else if (TestBase.FetchData(browser).toString().equalsIgnoreCase("Chrome")) {
         
         driver = new EdgeDriver();
     } else {
    	 driver = new ChromeDriver();
     }
         driver.get(TestBase.FetchData("url").toString());
    
 }
     
public void CloserDriver()
{
driver.close();
}
	
}
