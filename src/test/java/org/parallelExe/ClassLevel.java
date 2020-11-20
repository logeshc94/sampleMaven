package org.parallelExe;

import org.testng.annotations.Test;

public class ClassLevel {
	// class level execution
		@Test
		private void method21() {
			System.out.println("method21");
			System.out.println(Thread.currentThread().getId());
		}
		@Test
		private void method22() {
			System.out.println("method22");
			System.out.println(Thread.currentThread().getId());
		}
		@Test
		private void method23() {
			System.out.println("method23");
			System.out.println(Thread.currentThread().getId());
		}
		@Test
		private void method24() {
			System.out.println("method24");
			System.out.println(Thread.currentThread().getId());
		}
		@Test
		private void method25() {
			System.out.println("method25");
			System.out.println(Thread.currentThread().getId());
		}
}
