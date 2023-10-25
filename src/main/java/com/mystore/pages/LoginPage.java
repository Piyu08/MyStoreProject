package com.mystore.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.mystore.Base.TestBase;

public class LoginPage extends TestBase {

	WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		this.driver=driver;
	}
	
	public void username(String username) {
		driver.findElement(By.id("email")).sendKeys(username);
	}
	
	public void password(String password) {
		driver.findElement(By.id("pass")).sendKeys(password);
	}	
	public void Login(){
	
	driver.findElement(By.id("pass")).click();
	
		
	}

}
