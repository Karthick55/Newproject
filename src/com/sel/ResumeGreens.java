package com.sel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ResumeGreens {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\Selinium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://greenstech.in/selenium-course-content.html");
		
		WebElement btnFirst = driver.findElement(By.xpath("//div [@id='heading201']"));
		btnFirst.click();
		
		WebElement btnSecond = driver.findElement(By.xpath("//a [contains (text (),'Model-1')]"));
		btnSecond.click();
	}

}
