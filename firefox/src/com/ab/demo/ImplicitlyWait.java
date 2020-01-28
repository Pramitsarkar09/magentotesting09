  package com.ab.demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ImplicitlyWait 
{

	public static void main(String[] args) 
	{
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        driver.get("https://www.magento.com");
        WebElement myacc = driver.findElement(By.linkText("My Account"));
		myacc.click();

		WebElement username = driver.findElement(By.id("email"));
		username.sendKeys("pramitsarkar1234@gmail.com");
		WebElement pwd = driver.findElement(By.id("pass"));
		pwd.sendKeys("qwerty@123");
		WebElement login = driver.findElement(By.id("send2"));
		login.click();
	
		WebElement logout = driver.findElement(By.linkText("Log Out"));
        logout.click();
        driver.close();
	}

}
