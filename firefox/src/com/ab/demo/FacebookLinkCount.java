package com.ab.demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FacebookLinkCount 
{

	public static void main(String[] args) 
	{
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
        List<WebElement> links = driver.findElements(By.tagName("a"));
        int lsize = links.size();
        System.out.println(lsize);
        for(WebElement link:links)
        {
        	String text = link.getText();
        	System.out.println(text);
        	if(text.contains("Games"))
        	{
        		link.click();
        	}
        }
       
	}

}
