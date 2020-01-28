package com.ab.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class EnableBoolean {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://account.magento.com/customer/account/create/");
		WebElement submit = driver.findElement(By.id("register"));
		System.out.println(submit.isEnabled());
		Thread.sleep(40000);
		System.out.println(submit.isEnabled());

	}

}
