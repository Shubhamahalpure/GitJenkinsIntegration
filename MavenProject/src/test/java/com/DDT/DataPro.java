package com.DDT;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import net.bytebuddy.implementation.bytecode.Duplication;

public class DataPro {

	WebDriver driver;

	@BeforeClass
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "D://Desktop/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}

	@Test(dataProvider="LoginData")
	public void loginTest(String uname,String pass) {
		driver.get("file:///D:/JBK%20Selenium/javabykiran-Selenium-Softwares/Offline%20Website/index.html");
		driver.findElement(By.xpath("/html/body/div/div[2]/form/div[1]/input")).sendKeys(uname);
		driver.findElement(By.xpath("/html/body/div/div[2]/form/div[2]/input")).sendKeys(pass);
		driver.findElement(By.xpath("/html/body/div/div[2]/form/div[3]/div/button")).click();
		

	}
    @DataProvider(name="LoginData")
	public String[][] getData() throws IOException {

		String path = "C:\\Users\\Akshay\\git\\GitJenkinsIntegration\\MavenProject\\TestData\\LoginData.xlsx";
		int rownum = XLUtils.getRowCount(path, "Sheet1");
		int colnum = XLUtils.getCellCount(path, "Sheet1", 1);

		String[][] logindata = new String[rownum][colnum];

		for (int i = 1; i <= rownum; i++) {
			for (int j = 0; j < colnum; j++) {

				logindata[i - 1][j] = XLUtils.getCellData(path, "Sheet1", i, j);
			}
		}
		return logindata;

	}

	@AfterClass
	public void tearDown() {
		driver.close();
	}

}
