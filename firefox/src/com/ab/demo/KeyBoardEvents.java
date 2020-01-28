package com.ab.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyBoardEvents 
{

	public static void main(String[] args) 
	{
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://cleartrip.com");
		WebElement from = driver.findElement(By.id("FromTag"));
		Actions a = new Actions(driver);
		a.moveToElement(from).click().sendKeys("tri").pause(5000).sendKeys(Keys.ARROW_DOWN).pause(3000).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();

	}

}
