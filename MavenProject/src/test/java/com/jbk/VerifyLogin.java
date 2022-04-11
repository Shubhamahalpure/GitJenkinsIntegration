package com.jbk;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.pages.Dashboard;
import com.pages.Login1;

public class VerifyLogin {
	
	@Test
	public void test() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///D:/JBK%20Selenium/javabykiran-Selenium-Softwares/Offline%20Website/index.html");
		
		Login1 lp = new Login1(driver);
		lp.typeUsername();
		lp.typePassword();
		lp.clickOnButton();
		
		Dashboard obj = new Dashboard(driver);
		Assert.assertTrue(obj.titlename().contains("Dashboard"));
		
	}

}
