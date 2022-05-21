package com.sel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomationTesting {
	public static void main(String[] args)  {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\Selinium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://greenstech.in/selenium-course-content.html");
		
		WebElement txtFirst = driver.findElement(By.xpath("//span [text()='Adyar']"));
        
		String text1 = txtFirst.getText();
	    System.out.println(text1);
	    
	    WebElement txtSecond = driver.findElement(By.xpath("//span [text()='No:11,']"));
	    String text2 = txtSecond.getText();
	    System.out.println(text2);
	    
	    WebElement txtThird = driver.findElement(By.xpath("//span [contains (text(),'First')]"));
	    String text3 = txtThird.getText();
	    System.out.println(text3);
	}

}
