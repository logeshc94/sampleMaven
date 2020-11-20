package org.testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class SampleTest {
	@BeforeClass
	private void method() {
		System.out.println("before Class");
	}

	@AfterClass
	private void aftercls() {
		System.out.println("After class");
	}

	@BeforeMethod
	private void beforeMethod() {
		System.out.println("Before");
	}

	@AfterMethod
	private void afterMethod() {
		System.out.println("After");
	}
	@Test
	private void test() {
		System.out.println("Test");
	}
	@Ignore
	@Test
	private void tes1t() {
		System.out.println("Test6");
	}
	@Test
	private void test2t() {
		System.out.println("Test5");
	}
}
