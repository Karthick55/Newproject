package com.sel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Sprint {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\Selinium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://sprint.com");
		
		Thread.sleep(5000);
		WebElement btnClose2 = driver.findElement(By.xpath("//button[@aria-label='Close']"));
		btnClose2.click();
		
		
		
		WebElement btnClose = driver.findElement(By.xpath(""));
		btnClose.click();
		
		Thread.sleep(3000);
		
		WebElement lnkPhones = driver.findElement(By.xpath(""));
		Actions actions=new Actions(driver);
		actions.moveToElement(lnkPhones).perform();
		
		WebElement lnkFive = driver.findElement(By.xpath(""));
		actions.moveToElement(lnkFive).perform();
	
		 
		
		
		
	}

}
