package com.sel;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindownHandlingClass {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\Selinium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		
		WebElement txtSearchBox = driver.findElement(By.id("twotabsearchtextbox"));
		txtSearchBox.sendKeys("I phone",Keys.ENTER);
		
		WebElement btnPhone = driver.findElement(By.xpath("//span [@class='a-size-medium a-color-base a-text-normal']"));
		btnPhone.click();
		
		String prtWinId = driver.getWindowHandle();
		System.out.println(prtWinId);
		
		Set<String> allWinId = driver.getWindowHandles();
		System.out.println(allWinId);
		
		for (String string : allWinId) {
			if (!(prtWinId.equals(string))) {
				driver.switchTo().window(string);
			}
			
			
			
		}
		WebElement btnCart = driver.findElement(By.id("add-to-cart-button"));
		btnCart.click();
	}

}
