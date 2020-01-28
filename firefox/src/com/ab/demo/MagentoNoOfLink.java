package com.ab.demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MagentoNoOfLink 
{

	public static void main(String[] args) 
	{
	  WebDriver driver = new FirefoxDriver();
	  driver.manage().window().maximize();
	  driver.get("https://www.amazon.com");
	  List<WebElement> links = driver.findElements(By.tagName("a"));
	  int lsize = links.size();
	  System.out.println(lsize);
	  for(int i=0; i<lsize; i++)
	  {
		  String text = links.get(i).getText();
		  System.out.println(text);
	  }

	}

}
