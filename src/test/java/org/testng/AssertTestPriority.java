package org.testng;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertTestPriority {
	@Test(priority = 10)
	private void method1() {
		String s = "Name";
		SoftAssert sa = new SoftAssert();
		sa.assertEquals("nme", s);
		System.out.println(s);
		sa.assertAll();
		System.out.println("method1");
	}
	@Ignore
	@Test(priority = -10)
	private void method12() {
		String s = "Name";
		Assert.assertEquals("name", s);
		System.out.println("method12");
	}
	@Test(priority=-100, invocationCount = 2)
	private void method5() {
		System.out.println("method5");
	}
	@Test(priority = -100)
	private void method10() {
		System.out.println("method10");

	}
}
