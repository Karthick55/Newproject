package com.sel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownClass {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\Selinium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		WebElement btnLogin = driver.findElement(By.xpath("//a [text()='Create New Account']"));
		btnLogin.click();
		
		Thread.sleep(2000);
		
		WebElement dropDay = driver.findElement(By.id("day"));
		
		Select select = new Select(dropDay);
		select.selectByValue("5");
	}

}
