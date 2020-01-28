package com.ab.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseEvents {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://amazon.in");
        WebElement acc = driver.findElement(By.xpath("//span[text()='Account & Lists']"));
        WebElement wishlist = driver.findElement(By.xpath("//span[text()='Your Wish List']"));
        Actions a = new Actions(driver);
        a.moveToElement(acc).build().perform();
        Thread.sleep(3000);
        a.moveToElement(wishlist).click().build().perform();
        

	}

}
