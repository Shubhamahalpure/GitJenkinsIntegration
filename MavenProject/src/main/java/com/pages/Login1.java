package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login1 {
	
	WebDriver driver;
	
	By username = By.id("email");
	By pass     = By.id("password");
	By loginbutton = By.xpath("//button");
	
	public Login1(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void typeUsername()
	{
		driver.findElement(username).sendKeys("kiran@gmail.com");
	}
	public void typePassword()
	{
		driver.findElement(pass).sendKeys("123456");
	}
	public void clickOnButton()
	{
		driver.findElement(loginbutton).click();
	}

}
