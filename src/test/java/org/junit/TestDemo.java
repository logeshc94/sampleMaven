package org.junit;



public class TestDemo {
	@BeforeClass
	public static void method1() {
		System.out.println("Before class");
	}

	@AfterClass
	public static void method2() {
		System.out.println("After Class");
	}
	
	@Before
	public void method3() {
		System.out.println("Before");
	}

	@After
	public void method4() {
		System.out.println("After");
	}
	@Ignore
	@Test
	public void method5() {
		System.out.println("Test1");
	}
	@Test
	public void method6() {
		System.out.println("met6");
	}
	@Ignore
	@Test
	public void method7() {
		System.out.println("center");
	}
	
	@Test
	public void method8() {
		System.out.println("methodLast");
	}
}
