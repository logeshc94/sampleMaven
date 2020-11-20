package org.testng;

import org.baseClass.BaseClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertDemoTestcase extends BaseClass {
	private AssertDemoScreen2 ads2;

	private void createObjAds2() {
		ads2 = new AssertDemoScreen2();
	}

	@BeforeClass
	private void chromeLanch() {
		browserLanch();
		urlLanch("https://www.facebook.com/");
	}

	@Test(priority = -10)
	private void ClickBtn() {
		AssertDemoScreen1 ads1 = new AssertDemoScreen1();
		btnClick(ads1.getBtnCreate());
	}

	@Test(priority = 5)
	private void enterName() {
		createObjAds2();
		txtInPut(ads2.getfName(), "Logesh");
		txtInPut(ads2.getlName(), "c");
		String txt = ads2.getlName().getAttribute("value");
		SoftAssert sa = new SoftAssert();
		sa.assertEquals("C", txt);
		txtInPut(ads2.getNumber(), "96597465896");
	}

	@Test(priority = 2)
	private void enterPass() {
		createObjAds2();
		txtInPut(ads2.getPass(), "1234567");
		String text = ads2.getPass().getAttribute("value");
		Assert.assertEquals("1234567", text);
		System.out.println(text);
	}

	@Test(priority = -2)
	private void selectOption() {
		createObjAds2();
		secByValue(ads2.getDate(), "6");
		secByValue(ads2.getMonth(), "6");
		secByValue(ads2.getYear(), "1994");
	}

	@Test(priority = -1)
	private void clickGender() {
		createObjAds2();
		btnClick(ads2.getGender());
		Assert.assertTrue(ads2.getGender().isSelected());
		System.out.println(ads2.getGender().isSelected());
	}

	@AfterClass
	private void windowClose() {
		closeWindow();
	}

}
