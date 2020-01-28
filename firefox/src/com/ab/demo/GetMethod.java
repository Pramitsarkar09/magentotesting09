package com.ab.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GetMethod 
{

	public static void main(String[] args) 
	{
	  WebDriver driver = new FirefoxDriver();
	  driver.manage().window().maximize();
	  driver.get("https://www.magento.com");
	  WebElement policy = driver.findElement(By.linkText("Privacy Policy"));
	  String text = policy.getText();
	  System.out.println(text);
	  String tagName = policy.getTagName();
	  System.out.println(tagName);
	  String hrefValue = policy.getAttribute("href");
	  System.out.println(hrefValue);

	}

}
