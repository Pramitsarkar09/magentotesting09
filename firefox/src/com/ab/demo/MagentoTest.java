package com.ab.demo;

import org.openqa.selenium.By; 
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MagentoTest 
{

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.magento.com");
		WebElement myacc = driver.findElement(By.linkText("My Account"));
		myacc.click();
		Thread.sleep(5000);
		WebElement username = driver.findElement(By.id("email"));
		username.sendKeys("pramitsarkar1234@gmail.com");
		WebElement pwd = driver.findElement(By.id("pass"));
		pwd.sendKeys("qwerty@123");
		WebElement login = driver.findElement(By.id("send2"));
		login.click();
		Thread.sleep(5000);
		WebElement logout = driver.findElement(By.linkText("Log Out"));
        logout.click();
        driver.close();
	}

}
