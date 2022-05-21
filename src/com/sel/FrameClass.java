package com.sel;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameClass {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\Selinium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://netbanking.hdfcbank.com/netbanking/");
		
		List<WebElement> frameOne = driver.findElements(By.tagName("frame"));
		int size = frameOne.size();
		System.out.println(size);
		
		driver.switchTo().frame(0);
		
		WebElement txtUser = driver.findElement(By.name("fldLoginUserId"));
		txtUser.sendKeys("hdfcbank");
		
		
		
	}

}
