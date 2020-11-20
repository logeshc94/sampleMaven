package org.rerun;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCase {
	@Test
	private void method1() {
		System.out.println("method1");
	}
	@Test
	private void method2() {
		System.out.println("method2");
	}
	@Test
	private void method3() {
		System.out.println("method3");
	}
	@Test
	private void method4() {
		System.out.println("method4");
		Assert.assertTrue(false);
	}
	@Test
	private void method5() {
		System.out.println("method5");
	}
}
