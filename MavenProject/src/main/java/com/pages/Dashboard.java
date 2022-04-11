package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Dashboard {
	
	WebDriver driver;
	
	By homepageusername = By.xpath("/html/body/div/div[1]/section[1]/h1");
	
	public Dashboard(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public String titlename()
	{
		return driver.findElement(homepageusername).getText();
	}
	
	

}
