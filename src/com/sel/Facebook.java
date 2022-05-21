package com.sel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\Selinium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		WebElement txtUserId = driver.findElement(By.xpath("//input [@id='email']"));
		txtUserId.sendKeys("Karthik05");
		
		WebElement txtPassword = driver.findElement(By.id("pass"));
		txtPassword.sendKeys("12345");
		
	}

}
