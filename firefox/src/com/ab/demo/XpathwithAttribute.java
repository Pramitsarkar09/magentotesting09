package com.ab.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class XpathwithAttribute 
{

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in");
		WebElement first = driver.findElement(By.xpath("//span[text()='Redmi Note 8 Pro (Electric Blue, 6GB RAM, 128GB Storage)']/../../../../../../../div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/a/span[1]"));
        first.sendKeys("pramit");
        Thread.sleep(2000);
        driver.close();

	}

}
