package com.mystore.testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.mystore.Base.TestBase;
import com.mystore.pages.LoginPage;
import com.mystore.utility.Utility;

public class LoginPageTest extends TestBase {
	
@Test(dataProvider="ExcelTestData",dataProviderClass=Utility.class)
public void login(String username, String password)throws Exception 
{

LoginPage login = new LoginPage(driver);
login.username(username);
login.password(password);
login.Login();
	
	}

}
