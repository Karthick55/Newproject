package com.sel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Instagram {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\Selinium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.instagram.com/?h1=en");
		
		WebElement txtUserName = driver.findElement(By.xpath("//input [@name='username']"));
		txtUserName.sendKeys("karthik");
		
		WebElement txtPaaword = driver.findElement(By.xpath("//input [@name='password']"));
		txtPaaword.sendKeys("12345");
		
	}

}
