package TestNGListnerConcept;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Base {
	
	static WebDriver driver;
	
	public static void initialization() {
		System.setProperty("webdriver.chrome.driver", "D://Desktop/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
	}
	
	public void failed() throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File trg = new File("C:\\Users\\Akshay\\git\\GitJenkinsIntegration\\MavenProject\\Screenshot\\sample.jpg");
		FileUtils.copyFile(src, trg);
		System.out.println("Screenshot taken successfully");
	}

}
