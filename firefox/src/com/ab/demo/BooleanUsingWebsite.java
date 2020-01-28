package com.ab.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BooleanUsingWebsite 
{

	public static void main(String[] args) 
	{
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.cleartrip.com");
		WebElement roundtrip = driver.findElement(By.id("RoundTrip"));
		if(roundtrip.isSelected()==true)
		{
			System.out.println("roundtrip is selected");
		}
		else
		{
			roundtrip.click();
		}
        WebElement returnOn = driver.findElement(By.id("ReturnDate"));
        if(returnOn.isDisplayed()==true)
        {
        	returnOn.sendKeys("Fri,14Feb,2020");
        }
        else
        {
        	System.out.println("returndate not disp");
        }
	}

}
