package com.ab.demo;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PropmtBoxPopUp 
{

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://echoecho.com/javascript4.htm");
        WebElement prompt = driver.findElement(By.xpath("//input[@name='B3']"));
        prompt.click();
        Alert a = driver.switchTo().alert();
        a.sendKeys("pramit");
        Thread.sleep(2000);
        a.accept();
        a.dismiss(); 

	}

}
