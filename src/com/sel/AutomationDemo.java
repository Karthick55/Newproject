package com.sel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomationDemo {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\Selinium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Register.html");
		
		WebElement txtFirstName = driver.findElement(By.xpath("//input [@placeholder='First Name']"));
	    txtFirstName.sendKeys("Karthik");
	    
	    WebElement txtLastName = driver.findElement(By.xpath("//input [@placeholder='Last Name']"));
	    txtLastName.sendKeys("Raja");
	    
	    WebElement txtAddress = driver.findElement(By.xpath("//textarea [@ng-model='Adress']"));
	    txtAddress.sendKeys("Omr,Chennai");
	    
	    WebElement btnGender = driver.findElement(By.xpath("//input [@value='Male']"));
	    btnGender.click();
	    
	    WebElement btnHobby = driver.findElement(By.xpath("//input [@value='Cricket']"));
	    btnHobby.click();
	    
	    WebElement btnHobby1 = driver.findElement(By.xpath("//input [@value='Movies']"));
	    btnHobby1.click();

	}

}
