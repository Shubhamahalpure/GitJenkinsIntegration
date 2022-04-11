package com.jbk;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.pages.LoginPage;

import io.github.bonigarcia.wdm.WebDriverManager;

public class logintest {
	@Test
	public void test01() {
		//System.setProperty("webdriver.chrome.driver", "D://Desktop/chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("file:///D:/JBK%20Selenium/javabykiran-Selenium-Softwares/Offline%20Website/index.html");
		
		LoginPage lp = new LoginPage(driver);
		lp.loginToApplication();
		Assert.assertEquals(driver.getTitle(), "JavaByKiran | Dashboard");
	}

}
