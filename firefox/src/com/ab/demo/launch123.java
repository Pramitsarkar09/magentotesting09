package com.ab.demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class launch123 {public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		String url = "https://www.google.com";
		driver.get(url);
		Thread.sleep(5000);
		driver.close();
	}

}