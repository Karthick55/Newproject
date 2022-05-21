package com.sel;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptText {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\Selinium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		WebElement txtUser = driver.findElement(By.id("email"));
		WebElement txtPass = driver.findElement(By.id("pass"));
		WebElement btnLogin = driver.findElement(By.name("login"));
		
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("arguments[0].setAttribute('value','raja')", txtUser);
		js.executeScript("arguments[0].setAttribute('value','1234')", txtPass);
		js.executeScript("arguments[0].click()",btnLogin);
		
		
		
	}

}
