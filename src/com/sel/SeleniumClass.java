package com.sel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class SeleniumClass {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\Selinium\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https:www.instagram.com");
		
		WebElement txtUserName = driver.findElement(By.name("username"));
		txtUserName.sendKeys("karthik05");
		
		
	}
 
}
