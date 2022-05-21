package com.sel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToolSqa {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\Selinium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://toolsqa.com/selenium-training?q=headers#enroll-form");
		
		WebElement txtFirstName = driver.findElement(By.xpath("//input [@id='first-name']"));
		txtFirstName.sendKeys("Karthick");
		
		WebElement txtLatName = driver.findElement(By.xpath("//input [@id='last-name']"));
		txtLatName.sendKeys("Raja");
		
		WebElement txtMailId = driver.findElement(By.xpath("//input[@id='email']"));
		txtMailId.sendKeys("karthick@gmail.com");
		
		WebElement txtMobile = driver.findElement(By.xpath("//input [@id='mobile']"));
		txtMobile.sendKeys("7010682939");
		
		WebElement btnCountry = driver.findElement(By.xpath("//select [@id='country']"));
		btnCountry.click();
		
		WebElement txtCity = driver.findElement(By.xpath("//input [@id='city']"));
		txtCity.sendKeys("tiruppur");
	}

}
