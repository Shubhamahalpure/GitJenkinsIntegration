package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	WebDriver lpdriver;
	
	@FindBy(id="email")
	 WebElement email;
	@FindBy(id="password")
	 WebElement password;
	@FindBy(xpath="//button")
	 WebElement button;
	

	public LoginPage(WebDriver driver) {
		this.lpdriver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public WebElement getUname() {
		return email;
	}
	public WebElement getPassword() {
		return password;
	}
	public WebElement getLoginButton() {
		return button;
	}
	
	public void loginToApplication() {
		getUname().sendKeys("kiran@gmail.com");
		// email.sendkeys("kiran@gmail.com");
		getPassword().sendKeys("123456");
		getLoginButton().click();
	}

}
