package org.junit;

import java.util.List;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.RunWith;
import org.junit.runner.notification.Failure;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({TestAssert.class,TestDemo.class})
public class TestSuite {

	public static void main(String[] args) {
		Result res = JUnitCore.runClasses(TestAssert.class,TestDemo.class);
		int fCount = res.getFailureCount();
		System.out.println(fCount);
		int rCount = res.getRunCount();
		System.out.println(rCount);
		int iCount = res.getIgnoreCount();
		System.out.println(iCount);
		List<Failure> failures = res.getFailures();
		for (Failure f : failures) {
			System.out.println(f.toString());
		}
	}
}
