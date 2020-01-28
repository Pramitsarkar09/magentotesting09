package com.ab.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Xpath {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("file:///E:/2.%20HTML%20Files/Visual%20Studio%20Code/xpath.html");
        WebElement pwd = driver.findElement(By.xpath("/html/body/input[3]"));
        pwd.sendKeys("1235456");
        Thread.sleep(2000);
        driver.close();
	}

}
