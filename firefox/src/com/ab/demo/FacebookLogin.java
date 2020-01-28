package com.ab.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FacebookLogin 
{

	public static void main(String[] args) 
	{
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		WebElement myacc = driver.findElement(By.id("email"));
		myacc.sendKeys("pramitsarkar1234@gmail.com");
		WebElement pwd = driver.findElement(By.id("pass"));
		pwd.sendKeys("sarkarpramitmaya9597");
		WebElement login = driver.findElement(By.id("loginbutton"));
		login.click();
		//WebElement arrow = driver.findElement(By.id("pageLoginAnchor"));
		//arrow.click();
		//WebElement settings = driver.findElement(By.cssSelector("_54nh"));
		//settings.click();
		driver.close();

	}

}
