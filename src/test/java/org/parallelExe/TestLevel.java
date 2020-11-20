package org.parallelExe;

import org.testng.annotations.Test;

public class TestLevel {
	// test level execution
		@Test(groups = "Reg")
		private void method11() {
			System.out.println("method11");
			System.out.println(Thread.currentThread().getId());
		}
		@Test
		private void method12() {
			System.out.println("method12");
			System.out.println(Thread.currentThread().getId());
		}
		@Test(groups = "Reg")
		private void method13() {
			System.out.println("method13");
			System.out.println(Thread.currentThread().getId());
		}
		@Test
		private void method14() {
			System.out.println("method14");
			System.out.println(Thread.currentThread().getId());
		}
		@Test(groups = "Reg")
		private void method15() {
			System.out.println("method15");
			System.out.println(Thread.currentThread().getId());
		}
}
