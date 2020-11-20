package org.testng;

import org.baseClass.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SuiteParameter extends BaseClass {

	@BeforeClass
	private void chromeLanch() {
		browserLanch();
		urlLanch("https://www.facebook.com/");
	}

	@Parameters({ "username" })
	@Test
	private void userName(String value) {
		WebElement userName = driver.findElement(By.id("email"));
		txtInPut(userName, value);
		String text = userName.getAttribute("value");
		SoftAssert sf = new SoftAssert();
		sf.assertEquals("gree", text);
		System.out.println(text);
	}

	@Parameters({ "pasword" })
	@Test(priority = -1)
	private void userPass(@Optional("java")String value) {
		WebElement userPass = driver.findElement(By.id("pass"));
		txtInPut(userPass, value);
		String txt = userPass.getAttribute("value");
		Assert.assertEquals("greens", txt);
		System.out.println(txt);
	}

	@AfterClass
	private void browser() {
		closeWindow();
	}
}
