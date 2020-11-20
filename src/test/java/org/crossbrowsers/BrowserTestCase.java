package org.crossbrowsers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class BrowserTestCase {
	WebDriver driver;
	@Parameters({"browser"})
	@Test(priority = -1)
	private void method1(String name) {
		if (name.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", 
					System.getProperty("user.dir") + "\\drivers\\chromedriver.exe");
			driver = new ChromeDriver();
		} else if (name.equalsIgnoreCase("ff")) {
			System.setProperty("webdriver.gecko.driver", "D:\\GreensTech\\Zip\\geckodriver.exe");
			driver = new FirefoxDriver();
		} else if (name.equalsIgnoreCase("Ie")) {
			System.setProperty("webdriver.edge.driver", "D:\\GreensTech\\Zip\\IEDriverServer.exe");
			driver = new InternetExplorerDriver();
		}	

	}
	@Test
	private void method() {
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("email")).sendKeys("Java");
		driver.findElement(By.id("pass")).sendKeys("java@123");
		
	}
}
