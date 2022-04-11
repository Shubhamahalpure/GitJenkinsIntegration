package com.jbk;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class demo {
	
	@Test
	
	public void browser(){
		
		System.setProperty("webdriver.chrome.driver", "D://Desktop/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/JBK%20Selenium/javabykiran-Selenium-Softwares/Offline%20Website/index.html");
		
		
		
	}
	
	
	

	 
	
	
	
}
