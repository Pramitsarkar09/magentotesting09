package com.ab.demo;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SizeDec 
{

	public static void main(String[] args) 
	{
	 WebDriver driver = new FirefoxDriver();
	 Dimension dim = driver.manage().window().getSize();
	 System.out.println(dim.getHeight());
	 System.out.println(dim.getWidth());
	 Dimension ndim = new Dimension(dim.getWidth()/2, dim.getHeight()/2);
	 System.out.println(ndim.getHeight());
	 System.out.println(ndim.getWidth());
	 driver.manage().window().setSize(ndim);
	 

	}

}
