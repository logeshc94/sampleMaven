package org.parallelExe;

import org.testng.annotations.Test;

public class MethodLevel {
	// method level execution
	@Test(groups = "E2E")
	private void method1() {
		System.out.println("method1");
		System.out.println(Thread.currentThread().getId());
	}
	@Test
	private void method2() {
		System.out.println("method2");
		System.out.println(Thread.currentThread().getId());
	}
	@Test(groups = "E2E")
	private void method3() {
		System.out.println("method3");
		System.out.println(Thread.currentThread().getId());
	}
	@Test
	private void method4() {
		System.out.println("method4");
		System.out.println(Thread.currentThread().getId());
	}
	@Test(groups = "E2E")
	private void method5() {
		System.out.println("method5");
		System.out.println(Thread.currentThread().getId());
	}
}
