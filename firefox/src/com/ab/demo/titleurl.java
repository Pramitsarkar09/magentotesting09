package com.ab.demo;

import java.util.Scanner;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class titleurl 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the browser");
		String browser = sc.next();
		if(browser.equalsIgnoreCase("firefox"))
		{
			FirefoxDriver f= new FirefoxDriver();
			test(f);
		}
		else
		{
			ChromeDriver c = new ChromeDriver();
			test(c);
		}
	}
     public static void test(WebDriver driver)
     {
    	 driver.get("https://www.gmail.com");
    	 String title = driver.getTitle();
    	 System.out.println(title);
    	 String curl = driver.getCurrentUrl();
    	 System.out.println(curl);
    	 driver.close();
    	 
     }
}
