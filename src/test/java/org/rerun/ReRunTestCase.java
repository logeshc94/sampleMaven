package org.rerun;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.IRetryAnalyzer;
import org.testng.annotations.ITestAnnotation;
import org.testng.internal.annotations.IAnnotationTransformer;

public class ReRunTestCase implements IAnnotationTransformer {

	public void transform(ITestAnnotation annotation, Class testClass, Constructor testConstructor, Method testMethod) {
		IRetryAnalyzer retryAnalyzer = annotation.getRetryAnalyzer();

		if (retryAnalyzer == null) {
			annotation.setRetryAnalyzer(FailedTestCase.class);
		}
	}

}
