package com.sel;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertsClass {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\Selinium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/alerts");
		
		
		
		WebElement btnPrombt = driver.findElement(By.id("promtButton"));
		Thread.sleep(2000);
		btnPrombt.click();
		
		Alert alert = driver.switchTo().alert();
		
		alert.sendKeys("hello");
		Thread.sleep(2000);
		alert.accept();
	}

}
