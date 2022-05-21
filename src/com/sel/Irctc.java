package com.sel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Irctc {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\Selinium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.cleartrip.com/trains");
		
		WebElement txtFrom = driver.findElement(By.xpath("//input [@id='from_station']"));
		txtFrom.sendKeys("Trichy");
		
		WebElement txtTo = driver.findElement(By.xpath("//input [@id='to_station']"));
		txtTo.sendKeys("Coimbatore");
		
		WebElement btnSearch = driver.findElement(By.xpath("//button [@id='trainFormButton']"));
		btnSearch.click();
	}

}
