package com.ab.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {

	public static void main(String[] args) 
	{
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.magento.com");
		WebElement myacc = driver.findElement(By.linkText("My Account"));
		myacc.click();
		WebElement username = driver.findElement(By.id("email"));
		username.sendKeys("pramitsarkar1234@gmail.com");
		WebElement password = driver.findElement(By.id("pass"));
		password.sendKeys("qwerty@123");
		WebElement login = driver.findElement(By.id("send2"));
		login.click();
		WebDriverWait w = new WebDriverWait(driver,5);
		WebElement logout = w.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Log Out")));
		logout.click();
		driver.close();
	}

}
