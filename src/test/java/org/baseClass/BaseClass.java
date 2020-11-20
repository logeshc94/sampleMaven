package org.baseClass;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class BaseClass {
	public static WebDriver driver;
	public static Select sec;
	public static void browserLanch() {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	public static void urlLanch(String url) {
		driver.navigate().to(url);;

	}
	public static void btnClick(WebElement ele) {
		ele.click();

	}
	public static void txtInPut(WebElement ele, String value) {
		ele.sendKeys(value);
	}
	public static void txtInPutEnter(WebElement ele, String value, Keys enter) {
		ele.sendKeys(value);
	}
//	public static void select(WebElement element) {
//		sec = new Select(element);
//	}
	public static void secByValue(WebElement element, String value) {
		sec = new Select(element);
		sec.selectByValue(value);
	}
//	public static void secByIndex(WebElement element, int value) {
//		sec = new Select(element);
//		sec.selectByIndex(value);
//	}
	public static void scroll(String s, String ele) {
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript(s, ele);

	}
	public static void closeWindow(){

		driver.quit();
	}
}
