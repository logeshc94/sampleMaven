package org.testng;

import org.baseClass.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderTestCase extends BaseClass {

//	@DataProvider(name = "value")
//	private Object[][] getData() {
//		return new Object[][] { { "green", "Greens@123" }, { "HExa", "Hexawar" } };
//	}
//	
//	@Test(dataProvider = "value")
//	private void method(String s, String s1) {
//		System.out.println(s);
//		System.out.println(s1);
//	}

	@DataProvider(name = "value")
	public Object[][] getData() {
		return new Object[][] { { "i phone x" }, { "redmi 9 pro" }, { "samsung a12" }, { "apple laptop" },
			{ "vgard" }, { "Benq moniter" }, { "samsung ssd 500gb" }, { "samsung 8 gb ram" },
			{ "mobile back case" }, { "mouse" } };
	}

	@Test(dataProvider = "value")
	public void method(String s) {
		browserLanch();
		urlLanch("https://www.amazon.in/");
		WebElement search = driver.findElement(By.id("twotabsearchtextbox"));
		search.sendKeys(s, Keys.ENTER);
	}
}
