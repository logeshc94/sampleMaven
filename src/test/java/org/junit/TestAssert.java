package org.junit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import junit.framework.Assert;

@SuppressWarnings("deprecation")
public class TestAssert {
	static WebDriver driver;

	@BeforeClass
	public static void method() {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");

	}

	@AfterClass
	public static void close() {
		driver.quit();
	}
	@Test
	public void currentUrl() {
//	String url = driver.getCurrentUrl();
	Assert.assertEquals("Checking url","https://www.facebook.com/", driver.getCurrentUrl());
	}

	@Test
	public void method1() {

		WebElement user = driver.findElement(By.id("email"));
		user.sendKeys("Hai");
		String s = user.getAttribute("value");
		Assert.assertEquals("UserName", "Hai", s);

	}

}
