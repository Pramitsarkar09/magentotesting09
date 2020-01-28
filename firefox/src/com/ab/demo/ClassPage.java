package com.ab.demo;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ClassPage {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("file:///E:/2.%20HTML%20Files/Visual%20Studio%20Code/page1.html");
        WebElement page2 = driver.findElement(By.linkText("page2"));
        page2.click();
        Set<String>handles = driver.getWindowHandles();
        System.out.println(handles);
        for (String handle:handles)
        {
        	driver.switchTo().window(handle);
        }
        WebElement page3 = driver.findElement(By.linkText("page3"));
        page3.click();
	}

}
